class Solution {
    public int solution(int n) {
        
        int sum = 0;
        
        while(true) {
            if(n == 0) return sum;
            
            sum += n % 10;
            n /= 10;
        } 
        
    }
}