import java.util.HashMap;
import java.util.Arrays;
import java.util.Map;

class Solution {
    public int[] solution(int[] emergency) {
        
        Map<Integer, Integer> map = new HashMap<>();
        
        int[] arr = Arrays.copyOfRange(emergency, 0, emergency.length);
        
        Arrays.sort(arr);
        
        for(int i=0; i<emergency.length; i++) {           
            map.put(arr[i], arr.length - i);
        }
        
        for(int i=0; i<emergency.length; i++) {
            emergency[i] = map.get(emergency[i]);
        }
        
        return emergency;
        
    }
}