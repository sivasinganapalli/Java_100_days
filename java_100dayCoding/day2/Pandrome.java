package day2;

public class Pandrome {
    public static void main(String[] args) {
        String s = "pop";
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);

        }
        System.out.println("Reverse string is :" + rev);

        if (s.equals(rev)) {
            System.out.println("This given string is palindrome...");
        } else {
            System.out.println("This given string is not a palindrome...");
        }

    }

}
