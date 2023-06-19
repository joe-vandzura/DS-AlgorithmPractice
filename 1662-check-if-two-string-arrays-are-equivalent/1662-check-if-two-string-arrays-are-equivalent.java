class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        boolean ans = false;
        String wordOne = "";
        String wordTwo = "";
        for (String word : word1) {
            wordOne += word;
        }
        for (String word : word2) {
            wordTwo += word;
        }
        if (wordOne.equals(wordTwo)) {
            ans = true;
        }
        return ans;
    }
}