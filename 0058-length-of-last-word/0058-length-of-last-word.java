class Solution {
    public int lengthOfLastWord(String s) {
        String lastWord = s.split(" ")[s.split(" ").length-1];
        return lastWord.length();
    }
}