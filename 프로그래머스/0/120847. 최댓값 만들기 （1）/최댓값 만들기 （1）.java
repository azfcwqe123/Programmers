class Solution {
    public int solution(int[] numbers) {
        
        int max_V = numbers[0];
        int prev_V = 0;
        
        for(int i=1; i<numbers.length; i++) {
            if(numbers[i] > max_V) {
                prev_V = max_V;
                max_V = numbers[i];
            } else if(numbers[i] > prev_V) {
                prev_V = numbers[i];
            }
        }
        
        return max_V * prev_V;
        
    }
}