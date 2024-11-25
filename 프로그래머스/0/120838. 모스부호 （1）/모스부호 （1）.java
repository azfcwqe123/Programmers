import java.util.HashMap;

class Solution {
    public String solution(String letter) {
        
        StringBuilder sb = new StringBuilder();
        
        HashMap<String, Character> map = new HashMap<>() {
            {
            put(".-", 'a');
            put("-...", 'b');
            put("-.-.", 'c');
            put("-..", 'd');
            put(".", 'e');
            put("..-.", 'f');
            put("--.", 'g');
            put("....", 'h');
            put("..", 'i');
            put(".---", 'j');
            put("-.-", 'k');
            put(".-..", 'l');
            put("--", 'm');
            put("-.", 'n');
            put("---", 'o');
            put(".--.", 'p');
            put("--.-", 'q');
            put(".-.", 'r');
            put("...", 's');
            put("-", 't');
            put("..-", 'u');
            put("...-", 'v');
            put(".--", 'w');
            put("-..-", 'x');
            put("-.--", 'y');
            put("--..", 'z');
            }
            
        };
        
            
        String[] arr = letter.split(" ");
        
        for(String x : arr) {
            
            sb.append(map.get(x));
        }
        
        return sb.toString();
    }
}