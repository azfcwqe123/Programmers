import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public String solution(String s) {
        
        StringBuilder sb = new StringBuilder();
        
        int[] arr = new int[26];
        
        for(char x : s.toCharArray()) {
            arr[x - 'a']++;
        }
        
        ArrayList<Character> list = new ArrayList<>(); 
            
        for(int i=0; i<26; i++) {
            if(arr[i] == 1) list.add((char) (i + 'a'));
        }
        
        Collections.sort(list);
        
        for(char x : list) {
            sb.append(x);
        }
        
        return sb.toString();
        
        
    }
}