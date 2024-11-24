import java.util.Stack;

class Solution {
    public String solution(int age) {
        
        StringBuilder sb = new StringBuilder();
        
        while(age > 0) {
            
            char ch = (char) (age % 10 + 'a');
            
            age /= 10;
            
            sb.append(ch);
        }
        
        return sb.reverse().toString();

    }
}