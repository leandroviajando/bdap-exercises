import java.util.Arrays;

public class RadixSort {
    /**
     * Sorts an array of strings using the Radix Sort algorithm.
     *
     * @param arr the array of strings to be sorted
     * @return the sorted array of strings
     */
    public static String[] radixSort(String[] arr) {

        // TODO: Complete this method
        return arr;
    }

    public static void main(String[] args) {
        String[] arr = { "apple", "banana", "pear", "kiwi", "avocado" };

        System.out.println("Original array: " + Arrays.toString(arr));
        String[] sorted = radixSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(sorted));

        String[] arr2 = { "c3e", "bfr", "aAD", "Abb", "Rtr", "Ast", "ASb", "Arv", "ASf", "rr", "gtz", "tgk", "mdf",
                "wfrf", "rfrx", "nrfr", "ffro", "srf", "ufrf", "frry" };
        System.out.println("Original array: " + Arrays.toString(arr2));
        String[] sorted2 = radixSort(arr2);
        System.out.println("Sorted array: " + Arrays.toString(sorted2));
    }
}
