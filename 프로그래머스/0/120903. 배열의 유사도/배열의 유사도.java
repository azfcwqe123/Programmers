class Solution {
    public int solution(String[] s1, String[] s2) {
        
        int ans = 0;
        
        for(String s : s1) {
            for(String x : s2) {
                if(s.equals(x)) ans++;
            }
        }
        
        return ans;
    }
}