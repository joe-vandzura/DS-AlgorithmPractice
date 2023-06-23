class Solution {
    public int subtractProductAndSum(int n) {
        String numAsString = String.valueOf(n);
        int[] digits = new int[numAsString.length()];
        for (int i = 0; i < digits.length; i++) {
            digits[i] = Integer.parseInt(numAsString.substring(i, i+1));
        }
        int product = 1;
        int sum = 0;
        for (int digit : digits) {
            product *= digit;
            sum += digit;
        }
        return product - sum;
    }
}