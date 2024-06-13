package day11;

import java.util.Arrays;

//Check if a String Contains Only Digits

public class Check_Digits {
    public static void main(String[] args) {
        String s = "kgkgkg";
        char[] c = s.toCharArray();
        Arrays.sort(c);
        int len = c.length;
        int numCount = 0;
        for (int i = 0; i < c.length; i++) {
            if (Character.isDigit(c[i])) {
                numCount++;

            }

        }
        if (numCount == len) {
            System.out.println("All the vlaues in the given string contains only digits");

        } else {
            System.err.println("All the vlaues in the given string does not only contains digits");
        }

    }

}
