class Solution {
    public int mostFrequent(int[] nums, int key) {

        int[] freq = new int[1001];

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == key) {
                freq[nums[i + 1]]++;
            }
        }

        int answer = 0;
        int max = 0;

        for (int i = 1; i <= 1000; i++) {
            if (freq[i] > max) {
                max = freq[i];
                answer = i;
            }
        }

        return answer;
    }
}