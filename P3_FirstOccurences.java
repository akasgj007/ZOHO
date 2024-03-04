/*
 
Given two strings, find the first occurrence of all characters of second string in the first string and

print the characters between the least and the highest index

I/P: ZOHOCORPORATION PORT

O/P: OHOCORPORAT



Explanation: The index of P in first string is 7, O is 1, R is 6 and T is 11. The largest range is 1 – 11.

So print the characters of the first string in this inex range i.e. OHOCORPORAT
 */

import java.util.Scanner;

public class P3_FirstOccurences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String first = sc.next();
        String second = sc.next();

        String result = firstOccurenes(first, second);

        System.out.println(result);
        sc.close();
    }

    private static String firstOccurenes(String first, String second) {
        int min = Integer.MAX_VALUE, max = -1;

        for (char c : second.toCharArray()) {
            int index = first.indexOf(c);
            if (index != -1) {
                min = Math.min(min, index);
                max = Math.max(max, index);
            }
        }

        return first.substring(min, max + 1);
    }
}
