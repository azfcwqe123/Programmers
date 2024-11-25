class Solution {
    public int solution(int i, int j, int k) {
        
        StringBuilder sb = new StringBuilder();
        
        for(int a=i; a<=j; a++) {
            sb.append(a);    
        }
        
        return String.valueOf(sb).replaceAll("[^" + k  +"]", "").length();
    }
}