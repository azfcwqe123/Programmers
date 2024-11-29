import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Solution {
    public int[] solution(int[][] score) {
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int[] t : score) {
            list.add(t[0] + t[1]);    
        }
        
        //Collections.sort(list, Comparator.reverseOrder());
        list.sort(Comparator.reverseOrder());
        
        int[] ans = new int[score.length];
        
        for(int i=0; i<score.length; i++) {
            ans[i] = list.indexOf(score[i][0] + score[i][1]) + 1;    
        }
        
        return ans;
        
        
    }
}