package bitmanipulation;

import java.util.Scanner;

public class ClearithBit {
    public static int clearith(int n, int i) {
        int bitmask = ~(1 << i);
        return n & bitmask;
    }

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = sc.nextInt();
        int result = clearith(n, i);
        if (result != n) {
            System.out.println("ith bit is cleared ");
        } else {
            System.out.println("number at ith bit is already cleared means already ith bit is 0 ");
        }
        sc.close();
    }
}
