class Solution {
    public String reverseWords(String s) {
        List<String> words = new ArrayList<>();
        s = s.trim();
        String word = "";
        for (int i = 0; i < s.length(); i++) {
            while (i < s.length() && s.charAt(i) != ' ') {
                word += s.charAt(i);
                i++;
            }
            if (word != "") {
                words.add(word);
                word = "";
            }
        }
        Collections.reverse(words);
                
        String ans = "";
        for (int i = 0; i < words.size()-1; i++) {
            ans += words.get(i) + " ";
        }
        ans += words.get(words.size()-1);
        
        return ans;
    }
}