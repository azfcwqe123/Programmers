class Solution {
    public int solution(int a, int b) {
            
        if(a == b) return 1;        
        
        int tmp = 1;
        
        for(int i=2; i<b; i++) {
            if(a % i == 0 && b % i == 0) tmp = i;    
        }
        
        b /= tmp;
        
        while(true) {
            
            if(b % 2 == 0) b /= 2;
            else break;
            
        }
        
        while(true) {
            
            if(b % 5 == 0) b /= 5;
            else break;
        }
        
        if(b == 1) return 1;
        else return 2;
        
    }
}