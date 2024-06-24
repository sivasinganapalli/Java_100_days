import java.util.ArrayList;

public class Merge_two_Arrays {
    public static void main(String[] args) {
        int[] a = { 5, 8, 10, 15, 18, 23 };
        int[] b = { 25, 28, 30, 35, 48, 53 };

        ArrayList<Integer> al1 = new ArrayList<>();
        for (int a2 : a) {
            al1.add(a2);
        }
        for (int b2 : b) {
            al1.add(b2);

        }

        System.err.println(al1.toString());
    }

}
