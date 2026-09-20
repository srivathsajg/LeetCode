class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int a = 0, b = 0;

        for (int x : aliceSizes) a += x;
        for (int x : bobSizes) b += x;

        int diff = (a - b) / 2;
        HashSet<Integer> set = new HashSet<>();

        for (int x : bobSizes)
            set.add(x);

        for (int x : aliceSizes) {
            if (set.contains(x - diff))
                return new int[]{x, x - diff};
        }

        return new int[0];
    }
}