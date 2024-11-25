class Solution {
    public String solution(String letter) {
        
        String[] arr = {".-", "-...", "-.-.", "-..", ".", "..-.",
                       "--.", "....", "..", ".---", "-.-", ".-..", 
                       "--", "-.", "---", ".--.", "--.-", ".-.",
                       "...", "-", "..-", "...-", ".--", "-..-",
                       "-.--", "--.."};
        
        String[] mos = letter.split(" ");
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<mos.length; i++) {
            for(int j=0; j<arr.length; j++) {
                if(mos[i].equals(arr[j])) sb.append((char) (j + 'a'));
            }    
        }
        
        return sb.toString();
        
    }
}