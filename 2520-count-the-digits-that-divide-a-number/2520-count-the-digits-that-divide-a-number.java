class Solution {
    public int countDigits(int num) {
        String numAsString = Integer.toString(num);
        int ans = 0;
        int[] digits = new int[numAsString.length()];
        for (int i = 0; i < digits.length; i++) {
            digits[i] = Integer.parseInt(numAsString.substring(i, i + 1));
        }
        for (int digit : digits) {
            if (num % digit == 0) {
                ans++;
            }
        }
        return ans;
    }
}