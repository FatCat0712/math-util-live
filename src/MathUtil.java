public class MathUtil {
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) { // Factorials grow very fast, so we limit to 20 to avoid overflow
            throw new IllegalArgumentException("Invalid input: " + n + ". Input must be a non-negative integer less than or equal to 20.");
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }


}
