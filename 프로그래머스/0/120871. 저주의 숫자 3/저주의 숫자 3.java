class Solution {
    public int solution(int n) {
        
        int ans = 0;
        
        for(int i=1; i<=n; i++) {
            ans++;
            
            while(ans % 3 == 0 || String.valueOf(ans).contains("3")) {
                ans++;
            }
            
        }
        
        return ans;
        
    }
}