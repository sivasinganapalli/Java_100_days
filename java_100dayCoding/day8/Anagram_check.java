package day8;

import java.util.Arrays;

public class Anagram_check {

    // a word, phrase, or name formed by rearranging the letters of another, such as
    // spar, formed from rasp.

    // Done this change in Develop Branch.

    public static void Anagram_check_1(String s1, String s2) {

        char[] c1 = s1.toCharArray();
        Arrays.sort(c1);
        char[] c2 = s2.toCharArray();
        Arrays.sort(c2);
        if (c1 == c2) {
            System.out.println("Both the strings " + s1 + " and " + s2 + " are Anagrams");
        } else {

            System.out.println("Both the strings " + s1 + " and " + s2 + " are not Anagrams");
        }

    }

    public static void main(String[] args) {
        Anagram_check_1("spar", "raspj");

    }
}
