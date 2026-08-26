class Solution {
    public int findMaxK(int[] nums) {

        boolean[] present = new boolean[1001];

        for (int num : nums) {
            present[Math.abs(num)] = true;
        }

        for (int k = 1000; k >= 1; k--) {

            boolean positive = false;
            boolean negative = false;

            for (int num : nums) {
                if (num == k) {
                    positive = true;
                }

                if (num == -k) {
                    negative = true;
                }
            }

            if (positive && negative) {
                return k;
            }
        }

        return -1;
    }
}