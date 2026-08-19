class Solution {
    public int reverseExponentiation(int n) {
        int temp = n;
        int rev = 0;

        // Find reverse
        while (temp > 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }

        // Calculate n raised to reverse
        int result = 1;
        for (int i = 0; i < rev; i++) {
            result *= n;
        }

        return result;
    }
}
