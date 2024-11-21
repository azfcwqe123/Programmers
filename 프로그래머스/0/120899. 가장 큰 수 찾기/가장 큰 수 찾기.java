class Solution {
    public int[] solution(int[] array) {
        
        int[] ans = new int[2];
        
        for(int i=0; i<array.length; i++) {
            if(array[i] > ans[0]) {
                ans[0] = array[i];
                ans[1] = i;
            }
        }
        
        return ans;
        
    }
}