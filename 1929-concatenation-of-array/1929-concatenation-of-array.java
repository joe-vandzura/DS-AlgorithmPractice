class Solution {
    public int[] getConcatenation(int[] nums) {
        
        int[] numsConcat = new int[nums.length * 2];
        
        for (int i = 0; i < nums.length; i++) {
            numsConcat[i] = nums[i];
        }
        int j = 0;
        for (int i = nums.length; i < nums.length * 2; i++) {
            numsConcat[i] = nums[j];
            j++;
        }
        return numsConcat;
    }
}