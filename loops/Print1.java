import java.util.*;

public class Print1 {
    public static void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            // spaces
            for (int j = 0; j < (n - i - 1); j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 0; j < (2 * i + 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // for (int i = 0; i < n; i++) {
        //     // spaces
        //     for (int j = 0; j < i; j++) {
        //         System.out.print(" ");
        //     }
        //     // stars
        //     for (int j = 0; j < (2 * n) - (2 * i + 1); j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
    }

    public static void print2(int n) {
        for (int i = 0; i < n; i++) {
            // spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 0; j < (2 * n) - (2 * i + 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the Number of test cases : ");
        // int t = sc.nextInt();
        // for (int i = 1; i <= t; i++) {
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        pattern1(n);
        print2(n);
        // }
    }
}
