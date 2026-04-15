package bitmanipulation;

import java.util.Scanner;

public class ClearRangeOfBits {
    public static int clearRange(int n, int i, int j) {
        int bitmask = (~0 << j + 1) | (1 << i) - 1;
        return n & bitmask;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = sc.nextInt();
        int j = sc.nextInt();
        int result = clearRange(n, i, j);
        System.out.println("result is : " + result);
        sc.close();
    }
}
