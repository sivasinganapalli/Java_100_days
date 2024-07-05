package day_22_05_07;

public class find_MissingInArray {

    public static int missingNumberInArray(int[] a1, int c1) {

        int misN;
        int sumAll;
        int total = 0;

        for (int i = 0; i < a1.length; i++) {

            total = total + a1[i];

        }

        sumAll = (c1 * (c1 + 1) / 2);

        misN = sumAll - total;

        return misN;
    }

    public static void main(String[] args) {
        int[] n1 = { 1, 2, 4, 6, 3, 7, 8 };
        int count = n1.length + 1;
        System.err.println("The missing integer in the array is : " + missingNumberInArray(n1, count));

    }

}
