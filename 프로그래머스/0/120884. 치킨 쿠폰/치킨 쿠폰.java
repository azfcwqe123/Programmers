class Solution {
    public int solution(int chicken) {
        
        int coupon = chicken;
        int cnt = 0;
        
        while(coupon >= 10) {
           
            cnt += coupon / 10;
            coupon = (coupon / 10) + (coupon % 10);
            
        }
        
        return cnt;
        
    }
}