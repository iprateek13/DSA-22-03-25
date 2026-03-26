import java.util.Scanner;

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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern14(n);
    }
}
