class Solution {
    public int solution(int n) {
        
        int[] check = new int[n+1];
        int sum = 1;
        
        for(int i=2; i<=n; i++) {
            
            while(true) {
                 
                if(n % i != 0) break;
                
                n /= i;
                
                check[i]++;
            }
            
            if(check[i] != 0) {
                sum *= (check[i] + 1);
            }            
        }
   
        return sum;
    }
}