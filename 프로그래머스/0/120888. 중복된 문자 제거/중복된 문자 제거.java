import java.util.LinkedHashSet;
import java.util.Set;

class Solution {
    public String solution(String my_string) {
        
        Set<Character> set = new LinkedHashSet<>();
        
        for(char x : my_string.toCharArray()) {            
            set.add(x);
        }
        
        String str = "";
        
        for(char x : set) {
            str += x;
        }  
        
        return str;
        
    }
}