class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        boolean[] seen = new boolean[1001];
        boolean[] common = new boolean[1001];

        for (int x : nums1)
            seen[x] = true;

        for (int x : nums2)
            if (seen[x])
                common[x] = true;

        int count = 0;
        for (boolean x : common)
            if (x) count++;

        int[] ans = new int[count];
        int i = 0;

        for (int x = 0; x <= 1000; x++)
            if (common[x])
                ans[i++] = x;

        return ans;
    }
}