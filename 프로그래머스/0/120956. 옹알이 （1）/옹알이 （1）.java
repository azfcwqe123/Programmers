class Solution {
    public int solution(String[] babbling) {
        
        int cnt = 0;
        
        for(String x : babbling) {
            
            x = x.replace("aya","1").replace("ye","1").replace("woo","1").replace("ma","1");
            
            x = x.replaceAll("[0-9]", "");
            
            if(x.isEmpty()) cnt++;
            
        }
        
        return cnt;
        
    }
}