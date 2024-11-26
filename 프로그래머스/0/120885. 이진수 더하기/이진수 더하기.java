import java.util.Stack;

class Solution {
    public String solution(String bin1, String bin2) {
        
        int sum1 = 0, sum2 = 0;
        
        for(int i=0; i<bin1.length(); i++) {
            sum1 += (bin1.charAt(i) - '0') << (bin1.length() -1 - i);
        }
        
        for(int i=0; i<bin2.length(); i++) {
            sum2 += (bin2.charAt(i) - '0') << (bin2.length() -1 - i);
        }
        
        int n = sum1 + sum2;
        
        Stack<Integer> stack = new Stack<>();
        
        if (n == 0) {
            return "0";
        }
        
        while(n > 0) {
            
            stack.push(n%2);
            
            n /= 2;
        }
        
        StringBuilder sb = new StringBuilder();
        
        while(!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        
        return sb.toString();
        
        
    }
}