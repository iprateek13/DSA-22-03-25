import java.util.Arrays;

public class LoneyElem {

    public static void loneyel(int[] arr) {
        Arrays.sort(arr);

        int n = arr.length;

        for (int i = 0; i < n; i++) {

            // First element
            if (i == 0) {
                if (arr[i] != arr[i + 1]) {
                    System.out.print(arr[i] + " ");
                }
            }

            // Last element
            else if (i == n - 1) {
                if (arr[i] != arr[i - 1]) {
                    System.out.print(arr[i] + " ");
                }
            }

            // Middle elements
            else {
                if (arr[i] != arr[i - 1] && arr[i] != arr[i + 1]) {
                    System.out.print(arr[i] + " ");
                }
            }
        }
    }

    public static void akeleElem2(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;

        for (int i = 0; i < n; i++) {

            boolean isLonely = true;

            // check previous
            if (i > 0 && (arr[i] == arr[i - 1] || arr[i] - 1 == arr[i - 1])) {
                isLonely = false;
            }

            // check next
            if (i < n - 1 && (arr[i] == arr[i + 1] || arr[i] + 1 == arr[i + 1])) {
                isLonely = false;
            }

            if (isLonely) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void akeleElem(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                if (arr[i] != arr[i + 1] && arr[i] + 1 != arr[i + 1]) {
                    System.out.print(arr[i] + " ");
                }
            } else if (i == n - 1) {
                if (arr[i] != arr[i - 1] && arr[i] - 1 != arr[i - 1]) {
                    System.out.print(arr[i] + " ");
                }
            } else {
                if (arr[i] != arr[i + 1] && arr[i] + 1 != arr[i + 1] && arr[i] != arr[i - 1]
                        && arr[i] - 1 != arr[i - 1]) {
                    System.out.print(arr[i] + " ");
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 2, 6, 8, 8 ,1 };
        // loneyel(arr);
        akeleElem(arr);
    }
}