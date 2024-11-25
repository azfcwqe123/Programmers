class Solution {
    public int solution(String my_string) {
        
        String str = my_string.replaceAll("[^\\d]+", " ");
        
        String[] arr = str.split(" ");
        
        int sum = 0;
        
        for(String x : arr) {
            if(!x.isEmpty()) sum += Integer.parseInt(x);
        }
        
        return sum;
        
    }
}