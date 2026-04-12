// package 2dArrays;

import java.util.Scanner;

public class Tranposematrix {

    public static int[][] transpose(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;

        int[][] ans = new int[m][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                ans[j][i] = arr[i][j];
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[m][n];

        int[][] res = transpose(arr);

        // print by for each
        for (int[] row : res) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
