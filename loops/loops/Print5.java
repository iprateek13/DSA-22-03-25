import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.*;

public class Print5 {
    public static void pattern12(int n) {
        for (int i = 0; i < n; i++) {
            // stars
            for (int j = 0; j < (n - i); j++) {
                System.out.print("*");
            }
            // spaces
            for (int j = 0; j < (2 * i); j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 0; j < (n - i); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {

            // stars
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            // spaces
            for (int j = 0; j < 2 * (n - i - 1); j++) {
                System.out.print(" ");
            }

            // stars
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    private static void pattern13(int n) {
        for (int i = 0; i < n; i++) {

            // stars
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            // spaces
            for (int j = 0; j < 2 * (n - i - 1); j++) {
                System.out.print(" ");
            }

            // stars
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
        for (int i = 1; i < n; i++) {
            // stars
            for (int j = 0; j < (n - i); j++) {
                System.out.print("*");
            }
            // spaces
            for (int j = 0; j < (2 * i); j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 0; j < (n - i); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void pattern14(int n) {
        int left, top, right, bottom;
        for (int i = 0; i < 2 * n - 1; i++) {
            for (int j = 0; j < 2 * n - 1; j++) {
                left = i;
                top = j;
                right = (2 * n - 2) - j;
                bottom = (2 * n - 2) - i;
                int tempvalue = Math.min(Math.min(top, bottom), Math.min(left, right));
                System.out.print(n - tempvalue + " ");
            }
            System.out.println();
        }
    }

    public static void factor(int n) {
        if (n <= 0) {
            System.out.println("Enter a positive number");
            return;
        }
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void factor2(int n) {
        LinkedList<Integer> ls = new LinkedList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                // System.out.print(i + " ");
                ls.add(i);
                // System.out.print((n / i) + " ");

                if (i != n / i) {
                    // System.out.print((n / i) + " ");
                    ls.add(n / i);
                }
            }
        }
        // ls.sort(Comparator.reverseOrder());
        ls.sort(null);
        for (var object : ls) {
            System.out.print(object + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // pattern14(n);
        factor2(n);
        sc.close();
    }
}
