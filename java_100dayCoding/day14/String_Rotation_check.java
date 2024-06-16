package day14;
/*Concept
The problem of checking if one string is a rotation of another string involves determining whether you can rotate the characters of one string to obtain the other string.

Example Consider the two strings:

String A:"waterbottle"String B:"erbottlewat"We need to determine if String B is a rotation of String A.

Explanation Understanding Rotation:

A rotation means shifting the characters of a string in a circular manner.For instance,rotating"waterbottle"by 3 positions to the left would give"erbottlewat".Properties of Rotation:

If String B is a rotation of String A,then String B should be a substring of the concatenation of String A with itself.Why Concatenate?:

Concatenating String A with itself(i.e.,"waterbottlewaterbottle")will cover all possible rotations of String A.By checking if String B is a substring of this concatenated string,we can determine if String B is a rotation of String A.Steps to Determine Rotation:Concatenate:Concatenate String A with itself to get"waterbottlewaterbottle".Check Substring:Check if String B("erbottlewat")is a substring of the concatenated string("waterbottlewaterbottle").Visualization String A:"waterbottle"String A+String A:"waterbottlewaterbottle"Now,if we look at"waterbottlewaterbottle":

Starting from the 4 th character(0-based index),we can see"erbottlewat",which matches String B.Therefore,since String B is found as a substring in the concatenated version of String A,String B is indeed a rotation of String A.*/

public class String_Rotation_check {

    public static boolean String_rotationCheck(String actualString, String RotationString) {
        if ((actualString.length() == RotationString.length()) && actualString.length() > 0) {
            String concat = actualString + actualString;
            return concat.contains(RotationString);

        }
        return false;
    }

    // StringBuilder sb = new StringBuilder();
    // sb.append(s + s);
    // actualString = actualString.concat(actualString);
    // System.out.println(actualString);
    // char[] c1 = actualString.toCharArray();
    // for (int i = 0; i < c1.length; i++) {
    // for (int j = i + 1; j <= c1.length; j++) {
    // String check = actualString.substring(i, j);
    // if (check.contains(RotationString)) {
    // System.out.println("Given string is the rotaiton string of the main string");
    // break;

    // }

    // }

    // }

    // return true;

    public static void main(String[] args) {
        boolean result = String_rotationCheck("waterbottle", "erbottlewat1");
        System.out.println("Given Strings are Rotaional strings ? " + result);

    }

}
