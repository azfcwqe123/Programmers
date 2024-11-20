class Solution {
    public int[] solution(int[] arr) {
        
        int[] check = new int[2];
        
        for(int i=0; i<arr.length; i++) {
            if(arr[i] % 2 == 0) {
                check[0]++;
            } else check[1]++;         
        }
        
        return check;
    }
}