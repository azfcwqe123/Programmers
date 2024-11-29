class Solution {
    public int solution(int[][] dots) {
        
        int max_x = -500, min_x = 500, max_y = -500, min_y = 500;
        
        for(int i=0; i<4; i++) {
            max_x = Math.max(dots[i][1], max_x);
            min_x = Math.min(dots[i][1], min_x);
            max_y = Math.max(dots[i][0], max_y);
            min_y = Math.min(dots[i][0], min_y);
        }
        
        return (max_x - min_x) * (max_y - min_y);
        
    }
}