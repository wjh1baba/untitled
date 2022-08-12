package one;

import java.util.Arrays;

public class copeshuzu {
    public static void main(String[] args) {
        int[] arr1 = {11, 22, 33, 44};
        int[] arr2 = new int[arr1.length];
        cope(arr1, arr2);
        printarr(arr1);
        printarr(arr2);
    }

    public static void printarr(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i == arr.length-1 ?arr[i]:arr[i]+",");
        }

        System.out.print("]");

    }

    public static void cope(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }

    }

}
