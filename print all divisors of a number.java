import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Integer> printDivisors(int n) {
        List<Integer> divisors = new ArrayList<>();
        
        // Loop from 1 to n to find all divisors
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                divisors.add(i);
            }
        }
        
        return divisors;
    }
}
