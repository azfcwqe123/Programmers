class Solution {
    public int solution(int n) {
        
        int cnt = 0;
        int i= 1;
        
        while(factorial(i) <= n) {            
            cnt++;
            i++;
        }
        
        return cnt;
        
    }
    
    public int factorial(int k) {
    
        if(k == 1) return 1;
        else return k * factorial(k-1);
        
    }
    
}