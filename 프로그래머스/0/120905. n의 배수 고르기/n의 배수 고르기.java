import java.util.ArrayList;

class Solution {
    public int[] solution(int n, int[] numlist) {
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0; i<numlist.length; i++) {
            if(numlist[i] % n == 0) list.add(numlist[i]);    
        }
        
        int[] ans = new int[list.size()];
        
        for(int i=0; i< list.size(); i++) {
            ans[i] = list.get(i);
        }
        
        return ans;
        
    }
}