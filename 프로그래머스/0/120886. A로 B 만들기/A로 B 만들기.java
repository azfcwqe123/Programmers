import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {
        
        char[] arr1 = before.toCharArray();
        char[] arr2 = after.toCharArray();
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        return Arrays.equals(arr1,arr2) ? 1 : 0;
    }
}