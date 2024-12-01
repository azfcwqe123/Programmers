class Solution {
    public int solution(String[] babbling) {
        
        int cnt = 0;
        
        for(String x : babbling) {
            
            x = x.replaceAll("(aya|ye|woo|ma)", "");
            
            x = x.replaceAll("[0-9]", "");
            
            if(x.isEmpty()) cnt++;
            
        }
        
        return cnt;
        
    }
}