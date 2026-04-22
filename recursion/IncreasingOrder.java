package recursion;

import java.util.Scanner;

public class IncreasingOrder {

    public static void increasingPrint(int n, int i) {
        if (i > n) {
            return;
        }
        System.out.print(i + " ");
        increasingPrint(n, i + 1);
    }

    public static void printbyBacktrack(int n) {
        if (n <1) {
            return;
        }
        printbyBacktrack(n - 1);
        System.out.println(n);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Num : ");
        int n = sc.nextInt();
        // increasingPrint(n, 1);
        printbyBacktrack(4);
        sc.close();
    }

}
