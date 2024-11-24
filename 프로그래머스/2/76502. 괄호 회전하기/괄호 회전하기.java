import java.util.Stack;
import java.util.HashMap;

class Solution {
    public int solution(String s) {
        
        HashMap<Character, Character> map = new HashMap<>();
        
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');
        
        int n = s.length();
        s += s;
        
        int ans = 0;
        
        A: for(int i=0; i<n; i++) {
            Stack<Character> stack = new Stack<>();
            
            for(int j=i; j<i+n; j++) {
                
                char ch = s.charAt(j);
                
                if(!map.containsKey(ch)) {
                    stack.push(ch);    
                }
                
                else {
                    if(stack.isEmpty() || !stack.pop().equals(map.get(ch))) {
                        continue A;
                    }
                }                
            }
            
            if(stack.isEmpty()) ans++;

        }
        
        return ans;
        
    }
}