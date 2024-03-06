package DSA_By_TapAcademy_Youtube;

public class LCMofN {

    // Bruteforce Approach
    private static int findLCM(int a, int b) {
        int max = Math.max(a, b);

        while (true) {
            if (max % a == 0 && max % b == 0)
                break;
            max++;
        }
        return max;
    }

    // LCM using optimized euclid algorithm
    private static int findLCMbyGCD(int a, int b) {
        return (a * b) / euclidGCD(a, b);
    }

    // Optimized Euclid's Algorithm - O(log(min(a,b)))
    private static int euclidGCD(int a, int b) {

        while (a != 0 && b != 0) {

            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
            // System.out.println("a : " + a + " b : " + b);
        }
        if (a != 0)
            return a;
        else
            return b;
    }

    public static void main(String[] args) {
        int a = 7, b = 3;
        int res1 = findLCM(a, b);
        System.out.println("LCM of " + a + " & " + b + " using bruteforce approach is " + res1);
        int res2 = findLCMbyGCD(a, b);
        System.out.println("LCM of " + a + " & " + b + " using GCD approach is " + res2);
    }

}
