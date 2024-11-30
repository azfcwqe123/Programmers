import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        
        ArrayList<Integer> list = new ArrayList<>(); 
         
        for(int x : numlist) {
            list.add(x);
        }
        
        Collections.sort(list, (a, b) -> {
            
            int c = Math.abs(a - n);
            int d = Math.abs(b - n);
            
            if(c == d) {
                return b - a;
            }
            
            return c - d;
        });
        
        return list.stream().mapToInt(x->x).toArray();
        
    }
    
}