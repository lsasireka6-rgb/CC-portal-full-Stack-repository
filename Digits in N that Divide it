class Solution {
    public int divisibleByDigits(String s) {
        int ans = 0;
        int[] rem = new int[10];

        for (char c : s.toCharArray()) {
            int digit = c - '0';

            for (int d = 1; d <= 9; d++) {
                rem[d] = (rem[d] * 10 + digit) % d;
            }
        }

        for (char c : s.toCharArray()) {
            int digit = c - '0';

            if (digit != 0 && rem[digit] == 0) {
                ans++;
            }
        }

        return ans;
    }
}
