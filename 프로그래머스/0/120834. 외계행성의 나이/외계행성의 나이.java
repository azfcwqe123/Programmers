import java.util.Stack;

class Solution {
    public String solution(int age) {
        
        StringBuilder sb = new StringBuilder();
        
        char[] arr = {'a','b','c','d','e','f','g','h','i','j'};
        
        while(age > 0) {
            
            sb.append(arr[age % 10]);
            
            age /= 10;
        }
        
        return sb.reverse().toString();

    }
}