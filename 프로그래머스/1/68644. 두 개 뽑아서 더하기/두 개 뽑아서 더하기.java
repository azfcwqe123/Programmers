import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;
import java.util.ArrayList;

class Solution {
    public ArrayList solution(int[] arr) {
        
        Set<Integer> set = new TreeSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0; i<arr.length; i++) {
            for(int j=i+1; j<arr.length; j++) {
                set.add(arr[i] + arr[j]);
            }    
        }
        
        Iterator<Integer> iter = set.iterator();
        
        while(iter.hasNext()) {
            list.add(iter.next());
        }
        
        return list;
        
    }
}