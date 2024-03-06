package DSA_By_TapAcademy_Youtube;

public class FindTrailingZeroesOfFactorialOfN {

    static int findTrailingZeroes(int n) {
        int res = 0, powerOf5 = 5;

        // n/5^1 + n/5^2 + n/5^3 + .... + n/5^n;

        while (n >= powerOf5) {
            res = res + (n / powerOf5);
            powerOf5 = powerOf5 * 5;
        }

        return res;
    }

    public static void main(String[] args) {
        int n = 200;
        int ans = findTrailingZeroes(n);
        System.out.println("Factorial of " + n + " has '" + ans + "' trailing zeroes");
    }
}
