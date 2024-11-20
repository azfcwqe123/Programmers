class Solution {
    public int solution(int[] arr, int n) {
        
        int ans = 0;
        
        for(int x : arr) {
            if(n == x) ans++;
        }
        
        return ans;
    }
}