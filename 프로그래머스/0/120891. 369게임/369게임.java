class Solution {
    public int solution(int order) {
        
        int cnt = 0;
        
        for(char x : String.valueOf(order).toCharArray()) {
            
            if(x == '3' || x == '6' || x == '9') {
                cnt++;       
            }
            
        }
        
        return cnt;
    }
}