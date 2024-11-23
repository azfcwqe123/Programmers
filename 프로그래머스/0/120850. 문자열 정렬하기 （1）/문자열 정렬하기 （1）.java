import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        
        char[] arr = my_string.replaceAll("[^0-9]", "").toCharArray();
        
        int[] ans = new int[arr.length];
        
        for(int i=0; i<arr.length; i++) {
            ans[i] = arr[i] - '0';
        }
        
        Arrays.sort(ans);
        
        return ans;
    }
}