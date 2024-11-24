import java.util.HashMap;
import java.util.Stack;

class Solution {
    boolean solution(String s) {
        
        HashMap<Character, Character> map = new HashMap<>();
        
        map.put(')', '(');
        
        Stack<Character> stack = new Stack<>();
        
        for(char x : s.toCharArray()) {
            
            if(map.containsKey(x)) {
                
                if(stack.isEmpty()) return false;
                else if(stack.pop().equals(map.get(x))) continue;
            }
            
            else {
                stack.push(x);
            }
            
        }
        
        return stack.isEmpty();
        
    }
}