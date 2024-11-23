class Solution {
    public int solution(int[] box, int n) {
       
        int[] tmp = {box[0] / n, box[1] / n, box[2] / n};
        
        return tmp[0] * tmp[1] * tmp[2];
    }
}