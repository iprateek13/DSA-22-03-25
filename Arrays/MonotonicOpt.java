import java.util.Scanner;

public class MonotonicOpt {
    public static boolean monotonic(int[] arr, int n) {
        boolean dec = true;
        boolean inc = true;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1])
                inc = false;
            if (arr[i] < arr[i + 1])
                dec = false;

        }
        return dec || inc;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean result = monotonic(arr, n);

        System.out.println("Array is Monotonic: " + result);
        sc.close();
    }
}
