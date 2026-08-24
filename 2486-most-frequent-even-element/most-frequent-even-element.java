class Solution {
    public int mostFrequentEven(int[] nums) {

        int[] count = new int[100001];

        
        for (int num : nums) {
            if (num % 2 == 0) {
                count[num]++;
            }
        }

        int answer = -1;
        int maxCount = 0;

        for (int i = 0; i <= 100000; i += 2) {

            if (count[i] > maxCount) {
                maxCount = count[i];
                answer = i;
            }
        }

        return answer;
    }
}