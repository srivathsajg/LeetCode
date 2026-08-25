class Solution {
    public boolean equalFrequency(String word) {

        int[] count = new int[26];

        for (char ch : word.toCharArray()) {
            count[ch - 'a']++;
        }

        for (int i = 0; i < 26; i++) {

            if (count[i] == 0) {
                continue;
            }

            count[i]--;

            int frequency = 0;
            boolean valid = true;

            for (int j = 0; j < 26; j++) {
                if (count[j] > 0) {
                    if (frequency == 0) {
                        frequency = count[j];
                    } else if (count[j] != frequency) {
                        valid = false;
                        break;
                    }
                }
            }

            count[i]++;

            if (valid) {
                return true;
            }
        }

        return false;
    }
}