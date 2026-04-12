// package 2d Arrays;

import java.util.*;

public class Takinginput2d {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // rows
        int m = sc.nextInt(); // columns

        int[][] arr = new int[n][m];
        System.out.println("_________________");
        // input lena
        for (int i = 0; i < n; i++) { // rows
            for (int j = 0; j < m; j++) { // columns
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("_________________");
        // print check
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
            sc.close();
        }
    }
}
