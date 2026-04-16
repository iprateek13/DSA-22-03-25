package bitmanipulation;

public class AddOnetoInt {
    public static int add1MineLOgic(int n) {
        int bitmask = -(~0);
        return n | bitmask;
    }

    public static int add1TOinteger(int n) {
        int ans = -(~n);
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(add1TOinteger(10));
        System.out.println(add1MineLOgic(10));
    }
}
