class Solution {
    public int solution(int[] sides) {
        
        int cnt = 0;
        
        // case 1
        int max_length = Math.max(sides[0], sides[1]);
        int tmp = Math.min(sides[0], sides[1]);
        
        for(int i=1; i<max_length; i++) {
            if(i + tmp > max_length) cnt++;
        }
        
        // case 2
        
        for(int i = max_length; i< sides[0] + sides[1]; i++) {
            if(sides[0] + sides[1] > i) cnt++;
        }
        
        return cnt;
            
    }
}