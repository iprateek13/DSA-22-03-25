import java.util.Scanner;

public class OnetoNPrintByStaticVar {
    static int n;

    public static void print1ton(int x) {
        if (x > n) {
            return;
        }
        System.out.print(x + " ");
        print1ton(x + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        n = sc.nextInt();
        print1ton(1);
        sc.close();
    }
}