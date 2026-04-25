package recursion;

import java.util.Scanner;

public class DecNto1 {
    public static void nto1print(int n) {
        // Base Case
        if (n == 0)
            return;
        // Work
        System.out.print(n + " ");
        // Call
        nto1print(n - 1);
    }

    public static void nto1pri(int n, int i) {
        // Base Case
        if (i > n) {
            return;
        } // Work
        nto1pri(n, i + 1); 
        System.out.print(i + " ");
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
