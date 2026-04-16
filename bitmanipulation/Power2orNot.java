package bitmanipulation;

public class Power2orNot {

    public static boolean isPowerOf2(int n) {
        if (n <= 0)
            return false; // edge case

        return (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        boolean result = isPowerOf2(1);

        if (result) {
            System.out.println("n is power of 2");
        } else {
            System.out.println("n is not power of 2");
        }
    }
}
