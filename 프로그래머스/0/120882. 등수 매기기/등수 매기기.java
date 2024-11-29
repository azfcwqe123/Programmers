class Solution {
    public int[] solution(int[][] score) {
        
        int[] arr = new int[score.length];
        
        for(int i=0; i<score.length; i++) {
            arr[i] += score[i][0] + score[i][1];
        }
        
        
        int[] res = new int[arr.length];
        
        for(int i=0; i<arr.length; i++) {      
            
            res[i]++;
            
            for(int j=0; j<arr.length; j++) {
                if(arr[i] < arr[j]) res[i]++;
            }
            
        }
        
        return res;
        
    }
}