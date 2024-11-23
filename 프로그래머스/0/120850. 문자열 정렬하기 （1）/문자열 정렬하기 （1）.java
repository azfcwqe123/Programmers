import java.util.ArrayList;
import java.util.Collections;


class Solution {
    public int[] solution(String my_string) {
        
        String str = my_string.replaceAll("[^0-9]", "");
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(char x : str.toCharArray()) {
            list.add(x - '0');    
        }
        
        Collections.sort(list);
        
        return list.stream().mapToInt(Integer::intValue).toArray();
        
    }
}