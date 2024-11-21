class Solution {
    public int solution(String my_string) {
        
        int sum = 0;
        
        String str = my_string.replaceAll("[^0-9]","");
        
        for(char x : str.toCharArray()) {
            sum += x - '0';    
        }
        
        return sum;
        
    }
}