class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        String[] reversedWords = new String[words.length];
        int index = 0;
        for (String word : words) {
            String reversedWord = "";
            for (int i = word.length()-1; i >= 0; i--) {
                reversedWord += word.charAt(i);
            }
            reversedWords[index] = reversedWord;
            index++;
        }
        return String.join(" ", reversedWords);
    }
}