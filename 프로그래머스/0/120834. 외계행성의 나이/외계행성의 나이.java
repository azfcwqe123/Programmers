import java.util.Stack;

class Solution {
    public String solution(int age) {
        
        StringBuilder sb = new StringBuilder();
        
        Stack<Character> stack = new Stack<>();
        
        while(age > 0) {
            char ch = (char) (age % 10 + 'a');
            
            stack.push(ch);
            
            age /= 10;
        }
        
        while(!(stack.isEmpty())) {
            
            sb.append(stack.pop());
        }
        
        return sb.toString();
    }
}