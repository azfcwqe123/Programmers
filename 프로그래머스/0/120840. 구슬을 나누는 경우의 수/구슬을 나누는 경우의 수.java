class Solution {
    public int solution(int balls, int share) {
        
        return combination(balls, share);
        
    }

    public int combination(int n, int m) {
        
        if(n==m || m == 0) return 1;
        else return combination(n-1, m-1) + combination(n-1, m);
        
    }    
}