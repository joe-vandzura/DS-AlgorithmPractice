class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        int index = 1;
        for (int i = 0; i < nums.length; i++) {
                if (i == 0) {
                    k++;
                } else if (nums[i] != nums[i-1]) {
                    k++;
                    nums[index] = nums[i];
                    index++;
                }
            }
        return k;
        }
    }