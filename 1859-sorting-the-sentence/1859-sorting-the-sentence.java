class Solution {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] sorted = new String[words.length];
        for (String word : words) {
            int place = Integer.parseInt(word.substring(word.length()-1));
            sorted[place - 1] = word.substring(0, word.length() - 1);
        }
        String ans = String.join(" ", sorted);
        return ans;
    }
}