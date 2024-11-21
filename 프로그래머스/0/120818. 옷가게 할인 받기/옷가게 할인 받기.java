class Solution {
    public int solution(int price) {
        
        if(100_000 <= price && price < 300_000) {
            return (int) (price * 0.95);   
        } else if(300_000 <= price && price < 500_000) {
            return (int) (price * 0.9);
        } else if(price >= 500_000) {
            return (int) (price * 0.8);
        }
        
        return price;
    }
}