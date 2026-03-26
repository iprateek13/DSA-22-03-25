import java.util.Scanner;

public class Print4 {
    private static void pattern4(int n) {
        for (int i = 1; i <= n; i++) {
            // numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // spaces
            for (int j = 1; j <= ((2 * n) - (2 * i)); j++) {
                System.out.print("_");
            }
            // numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();
        }
    }

    private static void pattern5(int n) {
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }

    private static void pattern6(int n) {
        for (int i = 0; i < n; i++) {
            char a = 'A';
            for (int j = 0; j <= i; j++) {
                System.out.print(a + " ");
                a++;
            }
            System.out.println();
        }
    }

    private static void pattern7(int n) {
        for (int i = 0; i < n; i++) {
            char a = 'A';
            for (int j = n; j >= i + 1; j--) {
                System.out.print(a + " ");
                a++;
            }
            System.out.println();
        }
    }

    private static void pattern8(int n) {
        char a = 'A';
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(a + " ");
            }
            System.out.println();
            a++;
        }
    }

    private static void pattern9(int n) {
        for (int i = 0; i < n; i++) {
            // spaces
            for (int j = 0; j < (n - i - 1); j++) {
                System.out.print("_");
            }
            char a = 'A';
            for (int j = 0; j <= i; j++) {
                System.out.print(a);
                a++;
            }
            // a=(char)(a-2);
            if (i == 0) {
                System.out.print("_");
            } else {
                char ch = (char) ('A' + (i - 1));
                for (int j = 0; j < i; j++) {
                    System.out.print(ch);
                    ch--;
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern9(n);
    }
}
