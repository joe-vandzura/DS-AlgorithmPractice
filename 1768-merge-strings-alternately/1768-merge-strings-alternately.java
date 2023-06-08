class Solution {
    public String mergeAlternately(String word1, String word2) {
        String concat = "";
        String longWord;
        String shortWord;
        if (word1.length() == word2.length()) {
            for (int i = 0; i < word1.length(); i++) {
                concat += word1.substring(i, i + 1) + word2.substring(i, i + 1);
        }
        } else {
            if (word1.length() > word2.length()) {
                longWord = word1;
                shortWord = word2;
                for (int i = 0; i < shortWord.length(); i++) {
                    concat += longWord.substring(i, i + 1) + shortWord.substring(i, i + 1);
                }
                concat += longWord.substring(shortWord.length(), longWord.length());
            } else if (word2.length() > word1.length()) {
                longWord = word2;
                shortWord = word1;
                for (int i = 0; i < shortWord.length(); i++) {
                    concat += shortWord.substring(i, i + 1) + longWord.substring(i, i + 1);
                }
                concat += longWord.substring(shortWord.length(), longWord.length());
            }
        }
        return concat;
    }
}