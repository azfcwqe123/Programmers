import java.util.Stack;

class Solution {
    public int solution(String my_string) {
        
        String[] s = my_string.split(" ");
        
        Stack<String> stack = new Stack<>();
        
        int sum = 0;
        
        stack.push(s[0]);
            
        for(int i=1; i<s.length; i+=2) {
            
            if(s[i].equals("+")) {                
                sum = Integer.parseInt(stack.pop()) + Integer.parseInt(s[i+1]);
                stack.push(String.valueOf(sum));
            }
            
            else if(s[i].equals("-")) {
                sum = Integer.parseInt(stack.pop()) - Integer.parseInt(s[i+1]);
                stack.push(String.valueOf(sum));
            }            
        }
        
        return Integer.parseInt(stack.pop());
        
    }
}