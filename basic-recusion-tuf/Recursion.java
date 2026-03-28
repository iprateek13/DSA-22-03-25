import java.util.Scanner;

public class Recursion {
    // 1 to N
    public static void print1toN(int i, int n) {
        if (i > n) {
            return;
        }
        System.out.print(i + " ");
        print1toN(i + 1, n);
    }

    public static void print1toNBack(int i, int n) {
        if (i < 1) {
            return;
        }
        print1toNBack(i - 1, n);
        System.out.print(i+" ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // print1toN(1, n);
        print1toNBack(4, 4);

    }
}
