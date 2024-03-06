/*
 R A B C

1 56 67 89

2 89 54 90

3 78 91 83

4 69 72 95

R – Rollno, A, B, C – Marks in three subjects

Given the above matrix, print the result of the queries given the following syntax.

The first input string has a single character denoting the field to be printed.

* – All fields of the selected rows

A – Print only field A

B – Print only field B

C – Print only field C

The second string contains the condition – <field><relational_operator><value>.

> – Greater than

< – Less than

= – Equal to



I/P: *

A>70

O/P:

2 89 54 90

3 78 91 83

4 69 72 95

I/P: A

C<90

O/P:

56

78
 */

import java.util.Scanner;

public class P7_Queries {
    public static void main(String[] args) {
        int arr[][] = new int[][] {
                { 1, 56, 67, 89 },
                { 2, 89, 54, 90 },
                { 3, 78, 91, 83 },
                { 4, 69, 72, 95 }
        };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter field to fetch either '*' for All Subjects or 'A/B/C' : ");
        String field = sc.nextLine();
        System.out.println("Enter condition as format '<field><relational_operator><value>' : ");
        String condition = sc.nextLine();

        printMarks(arr, field, condition);
        sc.close();
    }

    private static void printMarks(int[][] arr, String field, String condition) {

        if (field.equals("*")) {
            int checkCol = condition.charAt(0) - 'A' + 1;
            int checkVal = Integer.parseInt(condition.substring(2));
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if (j == checkCol) {
                        if (condition.charAt(1) == '>') {
                            if (arr[i][j] > checkVal) {
                            }
                        } else if (condition.charAt(1) == '<') {

                        } else {

                        }
                    }
                }
            }
        }

    }
}
