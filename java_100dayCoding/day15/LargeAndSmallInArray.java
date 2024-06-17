package day15;

import java.util.Arrays;

public class LargeAndSmallInArray {
    public static void main(String[] args) {

        int[] a = { 45, 64, 31, 9, 32, 98 };
        Arrays.sort(a);
        int lenght_of_array = a.length;
        System.out.println("The smallest number in the array is :" + a[0]);
        System.out.println("The Largest number in the array is :" + a[lenght_of_array - 1]);

    }

}
