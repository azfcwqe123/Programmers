class Solution {
    public int solution(int[] arr) {
    
        if(arr[1] - arr[0] == arr[2] - arr[1]) {
            return arr[arr.length - 1] + arr[1] - arr[0];
        } else {
            return arr[arr.length - 1] * (arr[1] / arr[0]);
        }
                
    }
}