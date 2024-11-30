class Solution {
    public String solution(String polynomial) {
        
        String[] arr = polynomial.split("\\s\\+\\s");
        
        int x = 0;
        int d = 0;
        
        for(String s : arr) {
            
            if(s.contains("x")) {
                
                if(s.replace("x", "").isEmpty()) x++;
                else x += Integer.parseInt(s.replace("x", ""));
            }
            
            else d += Integer.parseInt(s);
            
        }
               
        
        if(x == 0 && d != 0) {
            return String.valueOf(d);
        }
        else if(x != 0 && d == 0) {
            if(x == 1) return "x";
            else return x + "x";
        }
        else if(x != 0 && d != 0) {
            if(x == 1) return "x + " + d;
            else return x + "x + " + d;
        }
        
        return "";
    }                    
}