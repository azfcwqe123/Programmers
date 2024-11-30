import java.util.HashMap;

class Solution {
    public int solution(int[] array) {
        
        int max = 0;
        int ans = 0;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int x : array) {
            
            int cnt = map.getOrDefault(x, 0) + 1;
            
            if(cnt > max) {
                max = cnt;
                ans = x;
            }
            
            else if(cnt == max) {
                ans = -1;    
            }
            
            map.put(x, cnt);
        }
        
        return ans;
        
    }
}