class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] answer = new int[n*2];
        int index = 0;
        for (int i = 0; i < n * 2; i+=2) {
            answer[i] = nums[index];
            index++;
        }
        for (int i = 1; i < n * 2; i+=2) {
            answer[i] = nums[index];
            index++;
        }
        return answer;
    }
}