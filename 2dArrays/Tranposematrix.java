// package 2dArrays;

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
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 } };

        int[][] res = transpose(arr);

        // print by for each
        for (int[] row : res) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
