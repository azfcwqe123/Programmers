class Solution {
    public String solution(String[] id_pw, String[][] db) {
        
        String login = "fail";
        
        for(int i=0; i<db.length; i++) {
                
            if(id_pw[0].equals(db[i][0])) {
                login = "wrong pw";
                
                if(id_pw[1].equals(db[i][1])) {
                    login = "login";
                    return login;
            
                }
            }                    
        }
        
        return login;
        
    }
}