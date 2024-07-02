package day_20_02_07;

import java.util.ArrayList;
import java.util.Arrays;

public class Rotate_Array {

    // public static int[] rotatedArray() {
    // return null;

    // }

    public static void main(String[] args) {

        int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25 };
        int d = 36;
        int[] temp = new int[arr1.length];
        if (d > arr1.length) {
            d = d % arr1.length;
            System.err.println(d);
        }
        for (int i = d; i < arr1.length; i++) {
            temp[i - d] = arr1[i];

        }
        for (int j = 0; j < d; j++) {
            temp[arr1.length - d + j] = arr1[j];

        }

        System.out.println(Arrays.toString(temp));

    }

}
