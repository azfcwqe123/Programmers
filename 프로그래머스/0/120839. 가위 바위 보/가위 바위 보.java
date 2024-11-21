class Solution {
    public String solution(String rsp) {
        
        char[] arr = rsp.toCharArray();
        
        StringBuilder sb = new StringBuilder();
        
        for(char x : arr) {
            if(x == '2') sb.append("0");
            if(x == '0') sb.append("5");
            if(x == '5') sb.append("2");
        }
        
        return sb.toString();
    }
}