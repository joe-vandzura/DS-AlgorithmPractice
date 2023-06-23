class Solution {
    public int differenceOfSum(int[] nums) {
        int elementSum = 0;
        int digitSum = 0;
        List<Integer> digits = new ArrayList<>();
        for (int num : nums) {
            elementSum += num;
            String numAsString = String.valueOf(num);
            for (int i = 0; i < numAsString.length(); i++) {
                digits.add(Integer.parseInt(numAsString.substring(i, i + 1)));
            }
        }
        for (int digit : digits) {
            digitSum += digit;
        }
        return Math.abs(elementSum - digitSum);
    }
}