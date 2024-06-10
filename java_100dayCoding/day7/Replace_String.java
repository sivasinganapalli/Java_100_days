package day7;

public class Replace_String {

    /*
     * In the replace example, we replace the substring "world" with "Java".
     * In the replaceAll example, we replace all occurrences of the word "Hello"
     * with "Hi".
     */
    public static void main(String[] args) {
        String s1 = "Welcome to Selenium";
        System.out.println("String before change : " + s1);
        // We are assingning the replaced value to another varibale because we cannot
        // change the value of string it is immutable.
        String s2 = s1.replace("Selenium", "Java");
        System.out.println(s2);

    }

}
