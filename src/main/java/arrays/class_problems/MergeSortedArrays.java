package arrays.class_problems;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSortedArrays {
    public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        if (arr1 == null && arr2 == null) {
            return new int[]{};
        }
        if (arr1 == null) return arr2.clone();
        if (arr2 == null) return arr1.clone();

        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] result = new int[n1 + n2];

        int i = 0;
        int j = 0;
        int k = 0; 

        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {
                result[k++] = arr1[i++];
            } else {
                result[k++] = arr2[j++];
            }
        }
        while (i < n1) {
            result[k++] = arr1[i++];
        }
        while (j < n2) {
            result[k++] = arr2[j++];
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array 1: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        if (n1 > 0) {
            System.out.println("Enter sorted elements for array 1:");
            for (int i = 0; i < n1; i++) {
                arr1[i] = sc.nextInt();
            }
        }
        System.out.print("Enter size of array 2: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        if (n2 > 0) {
            System.out.println("Enter sorted elements for array 2:");
            for (int i = 0; i < n2; i++) {
                arr2[i] = sc.nextInt();
            }
        }
        int[] merged = mergeSortedArrays(arr1, arr2);
        System.out.println("Merged Array: " + Arrays.toString(merged));
        sc.close();
    }
}