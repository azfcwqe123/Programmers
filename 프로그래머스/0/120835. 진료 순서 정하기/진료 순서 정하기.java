class Solution {
    public int[] solution(int[] arr) {
        
        int[] ans = new int[arr.length];
        
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr.length; j++) {
                
                if(arr[i] <= arr[j]) ans[i]++;
            }
        }
        
        return ans;
        
    }
}