public class Selectionsort {
    public static void selection(int arr[], int n) {
        for (int i = 0; i < n - 2; i++) {
            int smallestInd = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[smallestInd]) {
                    smallestInd = j;
                }
                // swap
                int temp = arr[smallestInd];
                arr[smallestInd] = arr[j];
                arr[j] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 5, 4, 1, 3, 2 };
        int n = arr.length;
        selection(arr, n);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
