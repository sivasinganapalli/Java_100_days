package day4;
//Check in debug mode for line numbers 26-28 for clarification.

import java.util.Arrays;
import java.util.HashMap;

public class Non_Repeating_Character {
    public static void main(String[] args) {
        String s = "hello";
        // Converted the character to character array
        char[] ch = s.toCharArray();
        System.out.println(ch);
        // Sorted the array
        Arrays.sort(ch);
        System.out.println(ch);
        // Initializing a dictionary of key type String and value type Integer to store
        // character and it repetition value in integer.
        HashMap<Character, Integer> m = new HashMap<Character, Integer>();
        System.out.println(m);
        /*
         * Traverse through each character in the character array and sets the character
         * to key and sets the value.
         * put will add the character in key and count in value
         * if it is not present add one and adds one if repeated
         */
        for (char c : ch) {
            m.put(c, m.getOrDefault(c, 0) + 1);
            System.out.println(m);
            // m.put(c, m.getOrDefault(c, 0) + 1);

        }
        // traverse through each character and checks to which character the value in
        // dictionary is 1(which is repeated once)
        System.out.println(m);
        for (char c : ch) {
            // if the value is one we can break to print the first non repeated character.
            if (m.get(c) == 1) {
                System.out.println(c);
                break;

            }

        }

    }

}
