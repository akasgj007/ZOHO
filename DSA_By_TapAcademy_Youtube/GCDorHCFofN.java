package DSA_By_TapAcademy_Youtube;

public class GCDorHCFofN {

    // Bruteforce Approach - O(min(a,b))
    private static int gcdMethod1(int a, int b) {
        int min = Math.min(a, b);

        for (int i = min; i >= 1; i--) {
            if (a % i == 0 && b % i == 0)
                return i;
        }
        return 1;
    }

    // Euclid's Algorithm - O(max(a,b))
    private static int euclidGCD(int a, int b) {

        while (a != b) {

            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
            System.out.println("a : " + a + " b : " + b);
        }

        return a;
    }

    // Optimized Euclid's Algorithm - O(log(min(a,b)))
    private static int optimizedEuclidGCD(int a, int b) {

        while (a != 0 && b != 0) {

            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
            System.out.println("a : " + a + " b : " + b);
        }
        if (a != 0)
            return a;
        else
            return b;
    }

    public static void main(String[] args) {
        int a = 30, b = 3;
        int res1 = gcdMethod1(a, b);
        System.out.println("GCD/HCF of " + a + " & " + b + " using bruteforce method  : " + res1);
        int res2 = euclidGCD(a, b);
        System.out.println("GCD/HCF of " + a + " & " + b + " using euclid algo method  : " + res2);
        int res3 = optimizedEuclidGCD(a, b);
        System.out.println("GCD/HCF of " + a + " & " + b + " using optimized euclid algo method  : " + res3);

    }
}
