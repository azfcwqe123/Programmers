class Solution {
    public String solution(String my_string) {
        
        StringBuilder sb = new StringBuilder();
        
        char[] arr = my_string.toCharArray();
        
        int lt = 0;
        int rt = my_string.length() - 1;
        
        while(lt < rt) {
            char tmp = arr[lt];
            arr[lt] = arr[rt];
            arr[rt] = tmp;
            
            lt++;
            rt--;
        }
        
        for(char x : arr) {
            sb.append(x);
        }
        
        return sb.toString();
        
    }
}