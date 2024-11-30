class Solution {
    public int solution(String A, String B) {
        
        if(A.equals(B)) return 0;
        
        A += A;
        
        int len = B.length();
        int cnt = 0;
        
        for(int i=len-1; i > 0; i--) {
            String tmp = A.substring(i, i + len);
            if(B.equals(tmp)) {
                return ++cnt;
            } else cnt++;
        }
        
        return -1;
        
    }
}