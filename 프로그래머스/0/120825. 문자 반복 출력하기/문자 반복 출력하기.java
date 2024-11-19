class Solution {
    public String solution(String str, int n) {
        
        StringBuilder sb = new StringBuilder();
        
        char[] arr = str.toCharArray();
        
        for(int i=0; i<arr.length; i++) {            
            sb.append(String.valueOf(arr[i]).repeat(n));
        }
        
        return sb.toString();
        
    }
}