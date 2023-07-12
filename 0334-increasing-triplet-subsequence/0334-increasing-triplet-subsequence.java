class Solution {
    public boolean increasingTriplet(int[] nums) {
        int smallest = Integer.MAX_VALUE;
        int secSmallest = Integer.MAX_VALUE;
        
        for (int num : nums) {
            if (num <= smallest) {
                smallest = num;
            } else if (num <= secSmallest) {
                secSmallest = num;
            } else {
                return true;
            }
        }
        return false;
    }
}