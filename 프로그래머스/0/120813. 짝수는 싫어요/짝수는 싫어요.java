class Solution {
    public int[] solution(int n) {
        
        int k = 0;
        
        if(n % 2 == 0) k = (n/2);
        else k = (n/2) + 1;
        
        int[] arr = new int[k];
        
        for(int i=0; i<arr.length; i++) {
            arr[i] = 2*i+1;
        }
        
        return arr;
        
    }
}