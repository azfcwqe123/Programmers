import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {
        
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        
        for(char x : before.toCharArray()) {
            arr1[x - 'a']++;
        }
        
        for(char x : after.toCharArray()) {
            arr2[x - 'a']++;
        }
        
        return Arrays.equals(arr1,arr2) ? 1 : 0;
    }
}