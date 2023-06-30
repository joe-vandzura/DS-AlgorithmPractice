class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> chars = new HashMap<Character, Integer>();
        chars.put('I', 1);
        chars.put('V', 5);
        chars.put('X', 10);
        chars.put('L', 50);
        chars.put('C', 100);
        chars.put('D', 500);
        chars.put('M', 1000);
        
        int ans = chars.get(s.charAt(s.length()-1));
        
        for (int i = s.length()-2; i >= 0; i--) {
            if (chars.get(s.charAt(i)) >=  chars.get(s.charAt(i+1))) {
                ans += chars.get(s.charAt(i));
            } else {
                ans -= chars.get(s.charAt(i));
            }
        }
        return ans;
    }
}