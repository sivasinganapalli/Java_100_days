package day6;

public class CountOfCharacters {

    public static int count_No_ofWords_inSingle_String(String s) {
        int count = 0;
        char c[] = s.toCharArray();
        for (char d : c) {
            count++;

        }

        return count;
    }

    public static void main(String[] args) {
        int n = count_No_ofWords_inSingle_String("swiss");
        System.out.println("No: of characters in the string is: " + n);

    }
}
