package day9;

import java.util.HashMap;

public class Remove_All_DuplicateCharacters {

    public static String remove_Duplicate_Characters_InString(String actual) {
        System.out.println("Given String is : " + actual);

        String end = "";

        char c1[] = actual.toCharArray();
        // Arrays.sort(c1);
        // System.out.println(c1);

        HashMap<Character, Integer> h1 = new HashMap<Character, Integer>();
        for (char c : c1) {
            h1.put(c, h1.getOrDefault(c, 0) + 1);
            // System.out.println(h1);
        }
        for (char c : c1) {
            if (h1.get(c) == 1) {
                end += c;

            }

        }
        return end;

    }

    public static void main(String[] args) {
        String removed = remove_Duplicate_Characters_InString("siva");
        System.out.println("String after removing all the duplicate characters and original characters : " + removed);

    }

}
