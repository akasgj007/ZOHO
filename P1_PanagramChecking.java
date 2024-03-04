/*1. Pangram Checking

Check whether all english alphabets are present in the given sentence or not

I/P: abc defGhi JklmnOP QRStuv wxyz

O/P: True

I/P: abc defGhi JklmnOP QRStuv

O/P: False */

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class P1_PanagramChecking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input : ");
        String input = sc.nextLine();
        sc.close();
        Set<Character> alphabets = new HashSet<>();
        // System.out.println((int) 'a' + " - " + (int) 'z');

        for (int i = 0; i < input.length(); i++) {
            if (Character.toLowerCase(input.charAt(i)) >= 97 &&
                    Character.toLowerCase(input.charAt(i)) <= 122) {
                alphabets.add(Character.toLowerCase(input.charAt(i)));
            }
        }
        System.out.println(alphabets);
        if (alphabets.size() == 26)
            System.out.println(
                    "True");
        else
            System.out.println("False");
    }

}