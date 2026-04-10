public class CountingMineLogic {

    public static void unStableCounting(int[] arr, int n) {
        // order of element is lost in this code
        // VALUE based print karta hai
        // POSITION ignore karta hai
        int[] freq = new int[4]; // values 0-3

        // Step 1: Frequency count
        for (int i = 0; i < n; i++) {
            freq[arr[i]]++;
        }

        // Step 2: Print sorted array
        for (int value = 0; value < freq.length; value++) {
            for (int j = 0; j < freq[value]; j++) {
                System.out.print(value + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 0, 3, 1, 2, 3, 1 };
        int n = arr.length;
        unStableCounting(arr, n);
    }
}
