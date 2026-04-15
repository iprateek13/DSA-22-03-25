package bitmanipulation;

import java.util.Scanner;

public class OddEvenCheck {
    public static void checkEvenOdd(int n) {

        if ((n & 1) == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        checkEvenOdd(n);
        sc.close();
    }

}
