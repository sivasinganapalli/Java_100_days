package day12;

import java.util.HashSet;

public class Split {
    public static void main(String[] args) {

        String s = "abc@123";
        char[] c1 = s.toCharArray();
        // HashSet<Character> h1 = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for (Character c2 : c1) {
            // System.out.println(c2);
            if (Character.isAlphabetic(c2) || Character.isDigit(c2)) {
                // h1.add(c2);
                sb.append(c2);

            } else {
                // h1.add(' ');
                sb.append(" ");
            }

        }
        System.out.println(sb.toString());

        /// Approach 1
        // String s = "abc:123";
        // String a[] = s.split(":");
        // for (String a1 : a) {
        // System.out.println(a1);

        // }

    }

}
