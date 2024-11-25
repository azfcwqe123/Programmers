class Solution {
    public int solution(int i, int j, int k) {
        
        int cnt = 0;
        
        
        for(int a=i; a<=j; a++) {
            
            for(char x : String.valueOf(a).toCharArray()) {
                
                if(x - '0' == k) cnt++;
                    
            }
        }
        
        return cnt;
    }
}