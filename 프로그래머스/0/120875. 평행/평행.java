class Solution {
    public int solution(int[][] dots) {
     
        if(slope1(dots[0][0], dots[0][1], dots[1][0], dots[1][1]) == slope2(dots[2][0], dots[2][1], dots[3][0], dots[3][1])) return 1;
        
        else if(slope1(dots[0][0], dots[0][1], dots[2][0], dots[2][1]) == slope2(dots[1][0], dots[1][1], dots[3][0], dots[3][1])) return 1;
        
        else if(slope1(dots[0][0], dots[0][1], dots[3][0], dots[3][1]) == slope2(dots[1][0], dots[1][1], dots[2][0], dots[2][1])) return 1;
        
        else return 0;
        
    }
    
    private double slope1(int x1, int y1, int x2, int y2) {        
       return (double) (y2 - y1) / (x2 - x1);           
    }
    
    private double slope2(int x1, int y1, int x2, int y2) {
        
       return (double) (y2 - y1) / (x2 - x1);           
    }
    
}