import java.util.*;

public class CountingSort {

    public static void countingSort(int[] arr) {
        int n = arr.length;

        // Step 1: Find max
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Step 2: Count array
        int[] count = new int[max + 1];

        // Step 3: Store frequency of elem of origional array into count array
        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }

        // Step 4: Rebuild sorted array
        int index = 0;
        for (int i = 0; i <= max; i++) { // Ye loop har possible number check karta hai:// 0 aaya?// 1 aaya?// 2 aaya?// ...
            // max tak //max is nothing but the indices of the count[]
            while (count[i] > 0) {
                arr[index] = i;
                index++;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 4, 2, 2, 8, 3, 3, 1 };

        countingSort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
