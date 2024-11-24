class Solution {
    public int solution(int n) {
        
        int pizza = 6;
        
        while(true) {
            
            if(pizza % n == 0) return pizza / 6;
            
            pizza += 6;
        }
        
    }
}