class Solution {
    public int[] solution(int[] array) {
        
        int[] ans = {array[0], 0};
        
        for(int i=1; i<array.length; i++) {
            if(array[i] > array[i-1]) {
                ans[0] = array[i];
                ans[1] = i;
            }
        }
        
        return ans;
        
    }
}