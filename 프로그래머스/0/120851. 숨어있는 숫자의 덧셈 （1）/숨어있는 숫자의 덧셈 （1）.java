class Solution {
    public int solution(String my_string) {
        
        char[] arr = my_string.toCharArray();
        
        int sum = 0;
        
        for(char x : arr) {
            if(Character.isDigit(x)) sum += x - '0';   
        }
        
        return sum;
        
    }
}