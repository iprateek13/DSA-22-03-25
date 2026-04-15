package bitmanipulation;

import java.util.Scanner;

public class GetithBit {
    public static int getIt(int n, int i) {
        int bitmask = 1 << i;
        return n & bitmask;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = sc.nextInt();
        int result = getIt(n, i);
        if (result != 0) {
            System.out.println("Ith bit is : 1");
        } else {
            System.out.println("ith bit is : 0");
        }
    }
}
