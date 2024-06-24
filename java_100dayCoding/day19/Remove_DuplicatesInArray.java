package day19;

import java.util.ArrayList;

public class Remove_DuplicatesInArray {
    public static void main(String[] args) {
        int[] a = { 9, 44, 1, 77, 5, 44, 7, 3, 96, 1, 39, 444, 73, 6, 5, 1 };
        ArrayList<Integer> ha1 = new ArrayList<Integer>();
        for (int a1 : a) {
            if (!ha1.contains(a1)) {
                ha1.add(a1);
                // System.err.println(ha1);

            }

        }

        System.out.println(ha1);

    }

}
