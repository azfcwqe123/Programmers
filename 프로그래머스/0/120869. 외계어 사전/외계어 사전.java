class Solution {
    public int solution(String[] spell, String[] dic) {
        
        
        for(String x : dic) {
            int cnt = 0;
            for(String s : spell) {
                if(x.contains(s)) cnt++;
            }
            if(cnt == spell.length) return 1;
        }
        
        return 2;
    }
}