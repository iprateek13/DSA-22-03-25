package bitmanipulation;

public class PowerOf2orNot {
    public static int isPowerOf2(int n) {
        if (n <= 0)
            return -1;
        int bitmask = n - 1;
        return (n) & bitmask;

    }

    public static void main(String[] args) {
        int result = isPowerOf2(1);
        if (result == 0) {
            System.out.println("n is in the power of 2");
        } else {
            System.out.println("n is not in the power of 2");
        }
    }
}
