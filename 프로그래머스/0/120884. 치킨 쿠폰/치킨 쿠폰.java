class Solution {
    public int solution(int chicken) {
        
        int coupon = 0;
        
        int cnt = 0;
        
        while(chicken >= 10) {
            
            cnt += chicken / 10;
            chicken = (chicken / 10) + (chicken % 10);
            
        }
        
        return cnt;
        
    }
}