class Solution {
    public String solution(String my_string) {
        
        StringBuilder sb = new StringBuilder();
        
        for(char x : my_string.toCharArray()) {
            if(x >= 'A'&& x <= 'Z') sb.append((char) (x + 32));
            if(x >= 'a' && x <= 'z') sb.append((char) (x -32));
        }
        
        return sb.toString();
        
    }
}