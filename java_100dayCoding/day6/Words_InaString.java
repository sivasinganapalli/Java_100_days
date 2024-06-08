package day6;

public class Words_InaString {

    public static int count_No_Of_Words_In_a_String(String s) {

        // "\\s+" is used to represent the space as a delimiter.
        // s.split("Regular_Expression") returns the string array[]
        String[] words = s.split("\\s+");
        int count = words.length;

        return count;
    }

    public static void main(String[] args) {
        int n = count_No_Of_Words_In_a_String("This is me sdgsgs sdgsgsvsg df adfad agdgssg");
        System.out.println("No:of words in the given string is : " + n);
    }

}
