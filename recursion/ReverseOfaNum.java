

public class ReverseOfaNum {
    public static int reverseNum(int n, int rev) {
        // last digit
        if (n == 0) {
            return rev;
        }
        int lastDigit = n % 10;
        return reverseNum(n / 10, rev * 10 + lastDigit);

    }

    public static void main(String[] args) {
        int reverse = reverseNum(100, 0);
        System.out.println(reverse);
    }
}
