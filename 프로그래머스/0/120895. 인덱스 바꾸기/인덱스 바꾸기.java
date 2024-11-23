class Solution {
    public String solution(String my_string, int num1, int num2) {
        
        return swap(my_string.toCharArray(), num1, num2);
        
    }
    
    public String swap(char[] arr, int a, int b) {
        
        char tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
        
        return String.valueOf(arr);
    }
    
}