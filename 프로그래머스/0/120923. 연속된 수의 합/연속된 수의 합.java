class Solution {
    public int[] solution(int num, int total) {
        
        int start = (total / num) - (num - 1) / 2;
        
        int[] arr = new int[num];
        
        arr[0] = start;
            
        for(int i=1; i<arr.length; i++) {
            arr[i] = arr[i-1] + 1;   
        }
        
        return arr;
    }
}