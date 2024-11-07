class Solution {
    public int[] solution(int[] num_list) {
        
        int lt = 0;
        int rt = num_list.length - 1;
        while(lt < rt) {
            int tmp = num_list[lt];
            num_list[lt] = num_list[rt];
            num_list[rt] = tmp;
            
            lt++;
            rt--;
        }
        
        return num_list;
        
    }
}