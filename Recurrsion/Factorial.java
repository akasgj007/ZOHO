package Recurrsion;

public class Factorial {
    public static void main(String[] args) {
        int n = 3;
        int ans = findFact(n);
        System.out.println("Factorial of " + n + " is " + ans);
    }

    public static int findFact(int n) {
        // base case
        if (n == 0)
            return 1;
        // smaller result
        int fact = findFact(n - 1);
        // self work
        return n * fact;
    }
}
