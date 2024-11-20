class Solution {
    public int solution(int[] arr, int height) {
        
        int ans = 0;
            
        for(int x : arr) {
            if(x > height) ans++;
        }
        
        return ans;
    }
}