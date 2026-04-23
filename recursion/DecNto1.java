package recursion;

import java.util.Scanner;

public class DecNto1 {
    public static void nto1print(int n) {
        if (n == 0)
            return;
        System.out.print(n + " ");
        nto1print(n - 1);
    }

    public static void nto1pri(int n, int i) {
        if (i > n) {
            return;
        }
        nto1pri(n, i + 1);
        System.out.print(i+" ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        // nto1print(n);
        nto1pri(n, 1);
        sc.close();
    }
}
