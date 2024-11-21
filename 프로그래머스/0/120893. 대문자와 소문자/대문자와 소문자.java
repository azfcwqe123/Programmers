class Solution {
    public String solution(String my_string) {
        
        StringBuilder sb = new StringBuilder();
        
        for(char x : my_string.toCharArray()) {
            if(Character.isUpperCase(x)) sb.append(Character.toLowerCase(x));
            if(Character.isLowerCase(x)) sb.append(Character.toUpperCase(x));
        }
        
        return sb.toString();
        
    }
}