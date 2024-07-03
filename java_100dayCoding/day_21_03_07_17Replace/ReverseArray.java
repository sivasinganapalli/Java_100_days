package day_21_03_07_17Replace;

import java.util.Arrays;

public class ReverseArray {

    public static int[] reverse_Array(int[] arr1) {
        int[] revArray = new int[arr1.length];
        System.err.println(arr1);
        for (int i = 0; i < arr1.length; i++) {
            revArray[i] = arr1[arr1.length - i - 1];

        }

        return revArray;

    }

    public static void main(String[] args) {
        int[] array1 = { 1, 2, 3, 4, 5 };
        // reverse_Array(array1);
        System.err.println("Reversed array is : " + Arrays.toString(reverse_Array(array1)));

    }

}
