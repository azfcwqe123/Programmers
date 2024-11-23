import java.util.ArrayList;

class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=num1; i<=num2; i++) {
            list.add(numbers[i]);    
        }
        
        return list.stream().mapToInt(x->x).toArray();
        
    }
}