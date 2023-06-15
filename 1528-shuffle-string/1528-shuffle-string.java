class Solution {
    public String restoreString(String s, int[] indices) {
        char[] chars = new char[s.length()];
        int i = 0;
        String answer = "";
        for (int index : indices) {
            chars[index] = s.charAt(i);
            i++;
        }
        for (char character : chars) {
            answer += character;
        }
        return answer;
    }
}