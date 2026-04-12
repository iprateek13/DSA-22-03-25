import java.util.Scanner;

public class TransposeMatrix {

    // Main transpose function
    public static int[][] transpose(int[][] arr) {

        int m = arr.length;
        int n = arr[0].length;

        // CASE 1: Square matrix → In-place (Optimal)
        if (m == n) {

            // Only upper triangle swap
            for (int i = 0; i < n; i++) { // O(n)
                for (int j = i + 1; j < n; j++) { // O(n)

                    // swap arr[i][j] ↔ arr[j][i]
                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
                }
            }

            // TC = O(n²)
            // SC = O(1) (no extra space)

            return arr; // same matrix return
        }

        // CASE 2: Rectangular matrix → new ans matrix
        else {

            int[][] ans = new int[n][m];

            for (int i = 0; i < m; i++) { // O(m)
                for (int j = 0; j < n; j++) { // O(n)

                    ans[j][i] = arr[i][j];
                }
            }

            // TC = O(m × n)
            // SC = O(m × n)

            return ans;
        }
    }

    // 🔹 Print function
    public static void printMatrix(int[][] arr) {

        for (int[] row : arr) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] arr = new int[m][n];

        // input
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int[][] result = transpose(arr);

        System.out.println("Transpose:");
        printMatrix(result);

        sc.close();
    }
}
