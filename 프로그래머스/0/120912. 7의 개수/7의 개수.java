class Solution {
    public int solution(int[] array) {
        
        StringBuilder sb = new StringBuilder();
        
        for(int x : array) {
            sb.append(String.valueOf(x));    
        }
        
        return sb.toString().replaceAll("[^7]","").length();
        
    }
}