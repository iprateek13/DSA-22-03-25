import java.util.Arrays;

public class InsertionSort {

    public static void insertionSort(int[] arr) {

        int n = arr.length;

        // for i = 0 to n-2 (tumhara logic)
        for (int i = 0; i <= n - 2; i++) {

            int sortedArrayTillNow = i;   // yaha tak sorted hai
            int newPatta = i + 1;         // next element jo insert karna hai

            int j = sortedArrayTillNow;   // piche move karne ke liye pointer

            // jab tak piche ja sakte hain aur newPatta chhota hai
            while (j >= 0 && arr[newPatta] < arr[j]) {

                // shift kar rahe hain (swap nahi)
                arr[j + 1] = arr[j];

                j--; // aur piche jao
            }

            // ab j ya to -1 ho gaya ya correct position mil gayi
            // to newPatta ko uske sahi jagah pe daal do
            arr[j + 1] = arr[newPatta];
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 4};

        insertionSort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
