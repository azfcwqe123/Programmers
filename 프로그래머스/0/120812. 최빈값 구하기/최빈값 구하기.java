import java.util.HashSet;
import java.util.ArrayList;

class Solution {
    public int solution(int[] array) {
        
        int[] check = new int[1000];
        
        for(int x : array) {
            check[x]++;
        }
        
        int max = -1;
        int ans = 0;
        
        for(int i=0; i<1000; i++) {      
            if(check[i] > max) {
                max = check[i];
                ans = i;
            }
        }
        
        int cnt = 0;
        
        for(int i=0; i<1000; i++) {
            if(max == check[i]) {
                cnt++;
            }
        }
        
        if(cnt > 1) return -1;
        else return ans;
        
    }
}