class Solution {
    public int numIdenticalPairs(int[] nums) {
        int answer = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 1; j < nums.length; j++) {
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