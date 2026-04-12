import java.util.Scanner;

public class Spiralmatrix {
    public static void spiralfunc(int[][] spiral) {
        int stRow = 0;
        int stCol = 0;
        int endRow = spiral.length - 1;
        int endCol = spiral[0].length - 1;
        while (stRow <= endRow && stCol <= endCol) {

            // top boundary
            for (int j = stCol; j <= endCol; j++) {
                System.out.print(spiral[stRow][j] + " ");
            }
            stRow++;

            // right boundary
            for (int j = stRow; j <= endRow; j++) {
                System.out.print(spiral[j][endCol] + " ");
            }
            endCol--;

            // Bottom boundary

            if (stRow <= endRow) {
                for (int j = endCol; j >= stCol; j--) {
                    System.out.print(spiral[endRow][j] + " ");
                }
            }
            endRow--;

            // left Boundary

            if (stCol <= endCol) {
                for (int j = endRow; j >= stRow; j--) {
                    System.out.print(spiral[j][stCol] + " ");
                }
            }
            stCol++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] spiral = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                spiral[i][j] = sc.nextInt();
            }
        }
        System.out.println("_____________________");
        spiralfunc(spiral);
        sc.close();
    }
}
