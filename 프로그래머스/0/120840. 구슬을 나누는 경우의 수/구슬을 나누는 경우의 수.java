class Solution {
    public int solution(int n, int m) {
        
        if(n == m || m == 0) return 1;
            
        else return solution(n-1, m-1) + solution(n-1, m);
        
    }    
}