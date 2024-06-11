package day9;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

    public static String remove_duplicates(String s1) {
        char[] c1 = s1.toCharArray();
        HashSet<Character> set1 = new HashSet<Character>();
        // As String builder is mutable and we can change the values of this string
        // builder.
        StringBuilder sb = new StringBuilder();
        // iterating through the each character in the given string
        for (Character character : c1) {
            // if that charactet not present in the set
            if (!set1.contains(character)) {
                // add the character to the set
                set1.add(character);
                // append to the string builder
                sb.append(character);

            }

        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println("String after removing duplicates : " + remove_duplicates("hello"));

    }
}
