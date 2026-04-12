import java.util.Scanner;

public class SearchinSorted {
    public static int[] search2dBrute(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (target == arr[i][j]) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] { -1, -1 };
    }

    public static int[] search(int[][] arr, int target) {

        for (int i = 0; i < arr.length; i++) {

            int left = 0;
            int right = arr[i].length - 1;

            // binary search in row i
            while (left <= right) {

                int mid = (left + right) / 2;

                if (arr[i][mid] == target) {
                    return new int[] { i, mid };
                }

                else if (arr[i][mid] < target) {
                    left = mid + 1;
                }

                else {
                    right = mid - 1;
                }
            }
        }

        return new int[] { -1, -1 };
    }

    public static int[] searchOptimal(int[][] arr, int target) {

        int Totrows = arr.length;
        int Totcols = arr[0].length;

        int Currrow = Totrows - 1;
        int Currcol = 0;

        while (Currrow >= 0 && Currcol < Totcols) {

            if (arr[Currrow][Currcol] == target) {
                return new int[] { Currrow, Currcol };
            }

            else if (arr[Currrow][Currcol] > target) {
                Currrow--; // move UP
            }

            else {
                Currcol++; // move RIGHT
            }
        }

        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();

        int[][] matrix = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };
        // int[] ans = search2dBrute(matrix, target);
        // int[] ans = search(matrix, target);
        int[] ans = searchOptimal(matrix, target);
        System.out.print("Found at index : " + ans[0] + "," + ans[1]);
        sc.close();
    }
}
