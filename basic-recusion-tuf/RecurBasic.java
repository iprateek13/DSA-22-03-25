import java.util.Scanner;

public class RecurBasic {
    public static void printnto1(int n) {
        if (n < 1) {
            return;
        }
        System.out.print(n + " ");
        printnto1(n - 1);
    }

    public static void printnto1ByBackTrack(int i, int n) {
        if (i > n) {
            return;
        }
        printnto1ByBackTrack(i + 1, n);
        System.out.print(i + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // printnto1(n);
        printnto1ByBackTrack(1, n);

    }
}