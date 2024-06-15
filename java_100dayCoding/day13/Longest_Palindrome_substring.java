package day13;

import java.util.ArrayList;
import java.util.List;

public class Longest_Palindrome_substring {

    public static List<String> Longest_palindrome_strings(String s) {
        ArrayList<String> ar1 = new ArrayList<>();
        ArrayList<String> ar3 = new ArrayList<>();
        ArrayList<String> long_palindrome_subStrings = new ArrayList<>();
        int h_length = 0;
        // HashMap<String, Integer> h1 = new HashMap<>();

        // Generating all the substrings on the given string and storing them in a
        // ArrayList.
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {

                ar1.add(s.substring(i, j));

            }

        }
        System.out.println("All the sub strings of the given string: " + ar1);
        // Checking the arrrayList and storing all the palindromic substrings in a new
        // ArrayList
        for (String str1 : ar1) {
            char c1[] = str1.toCharArray();
            String actual = str1;
            String reverse = "";
            // int length = 0;
            for (int k = actual.length() - 1; k >= 0; k--) {
                reverse = reverse + c1[k];
                if (actual.equals(reverse)) {
                    // System.err.println("Palindrome sub strings are : " + actual);
                    ar3.add(actual);

                }

            }

        }
        System.out.println("All the substrings which are palindromes are : " + ar3);
        // Finding the highest length in the List of palindrome substrings
        for (String ar4 : ar3) {
            int length = ar4.length();

            if (length >= h_length) {
                h_length = length;

            }

        }
        System.out.println("Maximum length of palindrome substring is : " + h_length);

        // Adding the highest length substrings into a new ArrayList.
        for (int l = 0; l <= ar3.size() - 1; l++) {
            if (ar3.get(l).length() == h_length) {

                long_palindrome_subStrings.add(ar3.get(l));
            }

        }

        return long_palindrome_subStrings;

    }

    public static void main(String[] args) {
        System.out.println("Longest palindrome subStrings are :  " + Longest_palindrome_strings("babad"));

    }

}
