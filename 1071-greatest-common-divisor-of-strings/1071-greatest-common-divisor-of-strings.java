class Solution {
    public String gcdOfStrings(String str1, String str2) {
        int gcd;
        if (!(str1 + str2).equals((str2 + str1))) {
            return "";
        } else if (str1.equals(str2)) {
            return str1;
        } else {
            int min = Math.min(str1.length(), str2.length());
            
            gcd = 0;
            
            for (int i = 1; i <= min; i++) {
                if (str1.length() % i == 0 && str2.length() % i == 0) {
                    gcd = i;
                }
            }
        }
        
        return str1.substring(0, gcd);
    }
}