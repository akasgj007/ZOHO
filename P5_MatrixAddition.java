/*
 Given n integer arrays of different size, find the addititon of numbers represented by the arrays

I/P: 4
3 5 4 2


Data : 

2 4 5

4 5 6 7 8

4 9 2 1

1 2

O/P: 50856
 */

import java.util.Scanner;

public class P5_MatrixAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n value : ");
        int row = sc.nextInt();
        int arr[][] = new int[row][];
        for (int i = 0; i < row; i++) {
            System.out.println("Enter number of digits for value " + (i + 1) + " : ");
            int col = sc.nextInt();
            arr[i] = new int[col];
            System.out.println("Enter data : ");
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix Addition : " + findMatrixAddition(arr));
        print2DArray(arr);
        sc.close();
    }

    private static int findMatrixAddition(int[][] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            String str = "";
            for (int j = 0; j < arr[i].length; j++) {
                str += arr[i][j];
            }
            result += Integer.parseInt(str);
        }
        return result;
    }

    public static void print2DArray(int[][] arr) {
        for (int r[] : arr) {
            for (int x : r) {
                System.out.print(x);
            }
            System.out.println();
        }
    }
}
