class Solution {
    public int solution(String my_string) {
        
        String[] arr = my_string.split("[^0-9]+");
        
        int sum = 0;
        
        for(String x : arr) {
            
            if(!x.isEmpty()){
                sum += Integer.parseInt(x);    
            }
        }
        
        return sum;
        
    }
}