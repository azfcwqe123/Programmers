import java.util.ArrayList;

class Solution {
    public ArrayList solution(int n) {
                
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=1; i<=n; i++) {
            if(i % 2 != 0) list.add(i);
        }
        
        return list;
        
    }
}