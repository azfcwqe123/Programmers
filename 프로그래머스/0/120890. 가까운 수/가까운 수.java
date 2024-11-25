class Solution {
    public int solution(int[] array, int n) {
        
        int ans = 0;
        
        int tmp = 1000;
        
        for(int x : array) {
            
            int dif = (int) Math.abs(x - n);
            
            if(dif < tmp) {
                tmp = dif;
                ans = x;
            }
            
            else if(dif == tmp) {
                ans = Math.min(x, ans);
            }
            
        }
        
        return ans;
        
    }
}