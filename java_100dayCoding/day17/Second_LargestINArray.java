package day17;

import java.util.Arrays;

public class Second_LargestINArray {
    public static void main(String[] args) {
        int[] n = { 31, 2, 4, -1, 678, 986, 3, 2, 0 };
        Arrays.sort(n);
        System.out.println("Second Largest element in the Array is :" + n[(n.length) - 2]);

    }

    // Check this link for preparation
    // "https://chatgpt.com/share/98bd6e2e-3880-4d61-b54b-f905a28e85ba"

}
