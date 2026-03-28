import java.util.Scanner;

public class PrintName {
    public static void printName(int n) {
        if (n == 0) {
            return;
        }
        System.out.println("Prateek");
        printName(n - 1);
    }

    public static void printName2(int i) {
        if (i == 6) {
            return;
        }
        System.out.println("Prateek");
        printName2(i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Number of times you want to print Name : ");
        // int n = sc.nextInt();
        // printName(n);
        int i = sc.nextInt();
        printName2(i);
    }
}
