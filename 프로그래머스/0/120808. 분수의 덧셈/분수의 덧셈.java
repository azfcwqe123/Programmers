class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        
        int numer = (numer1 * denom2) + (numer2 * denom1); 
        int denom = denom1 * denom2;
        
        int k = gcd(numer, denom);
        
        return new int[] {numer / k, denom / k};
        
    }
    
    private int gcd(int a, int b) {
        
        if(b==0) return a;
        
        return gcd(b, a % b);
    }
    
}