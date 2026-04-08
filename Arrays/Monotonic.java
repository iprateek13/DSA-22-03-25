import java.util.Scanner;

public class Monotonic {

    public static boolean incmonotonicity(int arr[], int n) {
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1])
                return false;
        }
        return true;
    }

    public static boolean decmonotonicity(int arr[], int n) {
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] < arr[i + 1])
                return false;
        }
        return true;
    }

    public static boolean isMonotonic(int arr[], int n) {
        boolean inc = incmonotonicity(arr, n);
        boolean dec = decmonotonicity(arr, n);
        return inc || dec;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean result = isMonotonic(arr, n);

        System.out.println("Array is Monotonic: " + result);
    }
}