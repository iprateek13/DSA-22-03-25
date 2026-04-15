package bitmanipulation;

import java.util.Scanner;

public class setIthBit {
    public static int setithBit(int n, int i) {
        int bitmask = 1 << i;
        return n | bitmask;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = sc.nextInt();
        int result = setithBit(n, i);
        if (result == n) {
            System.out.println("ith bit is already 0");

        } else {
            System.out.println("ith bit set now ");
        }
        sc.close();
    }
}
