class Solution {
    public int solution(String my_string) {
        
        String[] s = my_string.split(" ");
        
        int sum = Integer.parseInt(s[0]);
        
        for(int i=1; i<s.length; i++) {
            
            if(s[i].equals("+")) {
                sum += Integer.parseInt(s[i+1]);
                i++;
            } 
            
            else if(s[i].equals("-")) {
                sum -= Integer.parseInt(s[i+1]);
                i++;
            }       
            
        }
        
        return sum;
        
    }
}