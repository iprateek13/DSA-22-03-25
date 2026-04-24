
public class PowerOfXopt {
    public static int optPowerXn(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int halfpower = optPowerXn(x, n / 2);
        int Powersquare = halfpower * halfpower;
        if (n % 2 == 1) {
            Powersquare = x * Powersquare;

        }
        return Powersquare;
    }

    public static void main(String[] args) {
        int value = optPowerXn(2, 5);
        System.out.println("Power of X^n is : " + value);
    }
}
