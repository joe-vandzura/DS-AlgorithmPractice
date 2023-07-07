class Solution {
    public String reverseVowels(String s) {
        int start = 0;
        int end = s.length()-1;
        
        while (start < end) {
            if (!isVowel(s.charAt(start))) {
                start++;
            }
            if (!isVowel(s.charAt(end))) {
                end--;
            }
            if (isVowel(s.charAt(start)) && isVowel(s.charAt(end))) {
                char startChar = s.charAt(start);
                char endChar = s.charAt(end);
                s = s.substring(0, start) + endChar + s.substring(start + 1);
                s = s.substring(0, end) + startChar + s.substring(end + 1);
                start++;
                end--;
            }
        }
        
        return s;
    }
    
    public static boolean isVowel(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return true;
        } else if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
            return true;
        }
        return false;
    }
}