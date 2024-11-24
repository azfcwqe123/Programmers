class Solution {
    boolean solution(String s) {
        
        int cnt = 0;
        
        for(char x : s.toCharArray()) {
            
            if(x == '(') cnt++;
            if(x == ')') cnt--;
            
            if(cnt < 0) return false;
        }
        
        return cnt == 0 ? true : false;
        
    }
}