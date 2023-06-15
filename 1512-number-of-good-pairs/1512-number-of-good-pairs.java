class Solution {
    public int numIdenticalPairs(int[] nums) {
        int sizeOfNumsArray = 0;
        for (int num : nums) {
            sizeOfNumsArray++;
        }
        int answer = 0;
        for (int i = 0; i < sizeOfNumsArray - 1; i++) {
            for (int j = 1; j < sizeOfNumsArray; j++) {
                if (nums[i] == nums[j] && j > i) {
                    System.out.println(i);
                    System.out.println(j);
                    System.out.println("---");
                    answer++;
                }
            }
        }
        return answer;
    }
}