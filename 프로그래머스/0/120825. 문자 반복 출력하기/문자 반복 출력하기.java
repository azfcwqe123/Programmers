class Solution {
    public String solution(String str, int n) {
        
        StringBuilder sb = new StringBuilder();
        
        for(char x : str.toCharArray()) {
            sb.append(String.valueOf(x).repeat(n));
        }
        
        return sb.toString();
        
    }
}