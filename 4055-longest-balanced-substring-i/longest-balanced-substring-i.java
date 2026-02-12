class Solution {
    public int longestBalanced(String s) {
        int n = s.length();
        int max = 0;

        for (int i = 0; i < n; i++) {
            int[] fr = new int[26];
            int d = 0;
            int maxF = 0;

            for (int j = i; j < n; j++) {
                int index = s.charAt(j) - 'a';

                if (fr[index] == 0) {
                    d++;
                }

                fr[index]++;
                maxF = Math.max(maxF, fr[index]);

                int length = j - i + 1;
                if (maxF * d == length) {
                    max = Math.max(max, length);
                }
            }
        }

        return max;
    }
}
