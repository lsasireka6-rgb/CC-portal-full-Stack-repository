class Solution {
    static int getLastDigit(String a, String b) {
        
        if (b.length() == 1 && b.equals("0")) {
            return 1;
        }

        
        if (a.length() == 1 && a.equals("0")) {
            return 0;
        }

        // 1. Get the last digit of string 'a'
        int base = a.charAt(a.length() - 1) - '0';

        // 2. Find the exponent modulo 4 from the last two digits of string 'b'
        int exp = 0;
        if (b.length() >= 2) {
            // Take the last two digits to find modulo 4
            exp = (b.charAt(b.length() - 2) - '0') * 10 + (b.charAt(b.length() - 1) - '0');
        } else {
            // If b has only 1 digit
            exp = b.charAt(0) - '0';
        }

        // 3. Modulo calculation
        int mod_exp = exp % 4;

        // If remainder is 0, it means it completely divides by 4, so the cycle ends at 4.
        if (mod_exp == 0) {
            mod_exp = 4;
        }

        // 4. Calculate (base^mod_exp) % 10
        int result = (int) Math.pow(base, mod_exp) % 10;

        return result;
    }
}