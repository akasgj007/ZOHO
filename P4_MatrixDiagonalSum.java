/*
 Given a matrix print the largest of the sums of the two triangles split by diagonal from top right to bottom left

I/P:

3 3

1 2 3

4 5 6

7 8 9

O/P: 38
 */

import java.util.Scanner;

public class P4_MatrixDiagonalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter row : ");
        int rows = sc.nextInt();
        System.out.println("Enter col : ");
        int cols = sc.nextInt();
        int arr[][] = new int[rows][cols];
        System.out.println("Enter data : ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Output : " + findMatrixDiagonalSum(arr, rows, cols));

        sc.close();
    }

    private static int findMatrixDiagonalSum(int[][] arr, int rows, int cols) {
        int leftSum = 0, rightSum = 0, diagSum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i + j == cols - 1) {
                    diagSum += arr[i][j];
                } else if (i + j < cols - 1) {
                    leftSum += arr[i][j];
                } else {
                    rightSum += arr[i][j];
                }
            }
        }

        return Math.max((leftSum + diagSum), (rightSum + diagSum));
    }
}
