package recursion;

public class SumofN {

    public static int sumofN(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sumofN(n - 1);

    }

    public static void main(String[] args) {
        int totSum = sumofN(4);
        System.out.println("TOtal sumOfN is :" + totSum);
    }
}
