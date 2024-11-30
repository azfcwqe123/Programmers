class Solution {
    public String[] solution(String[] quiz) {
        
        for(int i = 0; i < quiz.length; i++) {
            
            String[] tmp = quiz[i].split(" ");
            
            int res1 = Integer.parseInt(tmp[0]) + Integer.parseInt(tmp[2]) * (tmp[1].equals("+") ? 1 : -1);             
            int res2 = Integer.parseInt(tmp[4]);

            quiz[i] = (res1 == res2 ? "O" : "X");
            
        }
        
        return quiz;
        
    }
}