class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans = "";
        Arrays.sort(strs, (a, b)->Integer.compare(a.length(), b.length()));

        boolean end = false;
        for (int i = 0; i < strs[0].length(); i++) {
            for (int j = 0; j < strs.length; j++) {
                if (strs[0].charAt(i) != strs[j].charAt(i)) {
                    end = true;
                    break;
                }
                if (j == strs.length-1) {
                    ans += strs[0].charAt(i);
                    break;
                }
            }
            if (end) {
                break;
            }
        }
        
        return ans;
    }
}