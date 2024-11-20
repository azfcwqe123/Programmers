import java.util.ArrayList;

class Solution {
    public int[] solution(int[] answers) {
        
        int[] A = {1,2,3,4,5};
        int[] B = {2,1,2,3,2,4,2,5};
        int[] C = {3,3,1,1,2,2,4,4,5,5};
        
        int[] scores = new int[3];
        
        for(int i=0; i<answers.length; i++) {
            
            if(answers[i] == A[i % A.length]) scores[0]++;
            if(answers[i] == B[i % B.length]) scores[1]++;
            if(answers[i] == C[i % C.length]) scores[2]++;            
        }
        
        int maxScore = Math.max(scores[0], Math.max(scores[1], scores[2]));
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0; i<3; i++) {
            if(maxScore == scores[i]) list.add(i+1);
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}