package Recurrsion;

//Find nth fibonacci number
public class Fibonacci {
    public static void main(String[] args) {
        int n = 10;
        System.out.print("Fibonacci Series : ");
        for (int i = 1; i <= n; i++) {
            System.out.print(" " + findFibonacci(i) + " ");
        }
        int ans = findFibonacci(n);
        System.out.println("\nFibonacci  number of index " + n + " is " + ans);
    }

    static int findFibonacci(int n) {
        if (n <= 1)
            return n;
        int res = findFibonacci(n - 1) + findFibonacci(n - 2);

        return res;
    }
}
