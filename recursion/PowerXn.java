package recursion;

public class PowerXn {

    public static int xpown(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int nextPowValue = xpown(x, n - 1);
        return x * nextPowValue;
    }

    public static void main(String[] args) {
        int value = xpown(2, 4);
        System.out.println("Value is : " + value);

    }
}
