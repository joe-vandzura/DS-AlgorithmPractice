class Solution {
    public int[] getConcatenation(int[] nums) {
        int sizeOfNumsArray = 0;
        for (int num : nums) {
            sizeOfNumsArray++;
        }
        
        int[] numsConcat = new int[sizeOfNumsArray * 2];
        
        for (int i = 0; i < sizeOfNumsArray; i++) {
            numsConcat[i] = nums[i];
        }
        int j = 0;
        for (int i = sizeOfNumsArray; i < sizeOfNumsArray * 2; i++) {
            numsConcat[i] = nums[j];
            j++;
        }
        return numsConcat;
    }
}