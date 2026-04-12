import java.util.Scanner;

public class DiagonalSumBRUTE {
    public static int DiagSum(int arr[][]) {
        int m = arr.length - 1;
        int n = arr[0].length - 1;
        int sum = 0;
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == j) {
                    sum += arr[i][j];
                } else if (i + j == m) {
                    if (i != j)
                        sum += arr[i][j];
                }
            }
        }
        return sum;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[m][n];//

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("_____________________");
        int sum = DiagSum(arr);
        System.out.println("Total Diagonal Sum: " + sum);
        sc.close();
    }

}
