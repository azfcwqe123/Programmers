class Solution {
    public int solution(int i, int j, int k) {
        
        int cnt = 0;
        
        for(int a=i; a<=j; a++) {
            
            int tmp = a;
            
            while(tmp > 0) {
                
                if(tmp % 10 == k) cnt++;
                
                tmp /= 10;
            }
            
        }
        
        return cnt;
        

    }
}