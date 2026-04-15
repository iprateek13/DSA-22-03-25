package bitmanipulation;

import java.util.Scanner;

public class ClearIbits {
    public static int cleariBits(int n, int i) {
        int bitmask = ~0 << i;
        return n & bitmask;
    
    }
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = sc.nextInt();
        int result = cleariBits(n, i);
        if (result == n) {
            System.out.println("Already Cleared");
        } else {
            System.out.println("Last i Bits Now Cleared");
        }
sc.close();
    }
}
