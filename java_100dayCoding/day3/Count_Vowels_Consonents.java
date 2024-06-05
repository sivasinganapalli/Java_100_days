package day3;

public class Count_Vowels_Consonents {
    public static void main(String[] args) {
        String s = "ThisIsMEEEEE";
        System.out.println("Given String is : " + s);
        int cons = 0;
        int vow = 0;
        for (int i = 0; i <= s.length() - 1; i++) {
            char c = s.charAt(i);
            if ((c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') || (c == 'A' || c == 'E' || c == 'I'
                    || c == 'O' || c == 'U')) {
                cons++;

            } else {
                vow++;
            }

        }
        System.out.println("No of vowels are : " + vow);
        System.out.println("No of Consonents are : " + cons);
    }

}