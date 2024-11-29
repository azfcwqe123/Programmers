class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        
        int[] max_pos = {board[1] / 2, -(board[1] / 2), -(board[0] / 2), board[0] / 2 };
        
        int x = 0, y = 0;
        
        for(String s : keyinput) {
            
            if(s.equals("up")) {
                if(y == max_pos[0]) continue;
                else y++;
            }
            
            if(s.equals("down")) {
                if(y == max_pos[1]) continue;
                else y--;
            }
            
            if(s.equals("left")) {
                if(x == max_pos[2]) continue;
                else x--;
            }
            
            if(s.equals("right")) {
                if(x == max_pos[3]) continue;
                else x++;
            }            
        }
        
        return new int[] {x, y};
        
    }
}