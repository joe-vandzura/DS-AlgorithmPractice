class Solution {
    public boolean squareIsWhite(String coordinates) {
        boolean isWhite = false;
        
        HashMap<Character, Integer> letterToNum = new HashMap<Character, Integer>();
        
        letterToNum.put('a', 0);
        letterToNum.put('b', 1);
        letterToNum.put('c', 2);
        letterToNum.put('d', 3);
        letterToNum.put('e', 4);
        letterToNum.put('f', 5);
        letterToNum.put('g', 6);
        letterToNum.put('h', 7);
        
        for (int i = 0; i < letterToNum.get(coordinates.charAt(0)); i++) {
            if (isWhite) {
                isWhite = false;
            } else {
                isWhite = true;
            }
        }
        
        for (int i = 1; i < coordinates.charAt(1); i++) {
            if (isWhite) {
                isWhite = false;
            } else {
                isWhite = true;
            }
        }
        
        return isWhite;
    }
}