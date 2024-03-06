package Recurrsion;

public class ArraySortedCheck {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 8, 19, 9, 15 };
        if (isArraySorted(arr, 0)) {
            System.out.println("Array is Sorted");
        } else
            System.out.println("Array is NOT Sorted");
    }

    static boolean isArraySorted(int[] arr, int index) {
        if (index == arr.length - 1)
            return true;

        return isArraySorted(arr, index + 1) && (arr[index] <= arr[index + 1]);
    }
}
