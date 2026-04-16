package bitmanipulation;

public class XpowXPonentiation {
    public static int xpowxExponent(int n) {
        int ans = 1;
        int x = n;
        while (n > 0) {
            if ((n & 1) == 1) {
                ans = ans * x;
            }
            x = x * x;
            n = n >> 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(xpowxExponent(3));
    }
}
