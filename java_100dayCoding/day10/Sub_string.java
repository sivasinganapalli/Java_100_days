package day10;

public class Sub_string {

    public static void main(String[] args) {
        String s = "abcd";
        // char[] c1 = s.toCharArray();
        int len = s.length();
        int count = 0;

        for (int i = 0; i <= len; i++) {
            for (int j = i + 1; j <= len; j++) {
                System.out.println(s.substring(i, j));
                count++;

            }

        }
        // System.out.println("No:of sub strings that can be formed with this string
        // \"%s\" are : %d",s, count);
        System.out.printf("No:of sub strings that can be formed with this string \"%s\" are : %d", s,
                count);

    }

}
