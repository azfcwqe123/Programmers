class Solution {
    public String[] solution(String[] quiz) {
        
        String[] OX = new String[quiz.length];
        
        for(int i = 0; i < quiz.length; i++) {
            
            String[] tmp = quiz[i].split(" ");
            
            int res1 = 0, res2 = 0;
            
            if(tmp[1].equals("+")) {
                res1 += Integer.parseInt(tmp[0]) + Integer.parseInt(tmp[2]);
            } else {
                res1 += Integer.parseInt(tmp[0]) - Integer.parseInt(tmp[2]);
            }
            
            if(tmp[4].equals("-")) res2 = Integer.parseInt(tmp[4]);
            else res2 = Integer.parseInt(tmp[4]);
            
            if(res1 == res2) OX[i] = "O";
            else OX[i] = "X";
            
        }
        
        return OX;
        
    }
}