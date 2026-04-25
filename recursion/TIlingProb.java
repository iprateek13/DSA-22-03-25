public class TIlingProb {
    public static int tIlingProb(int n) {
        if (n == 0 || n == 1)
            return 1;
        return tIlingProb(n - 1) + tIlingProb(n - 2);
    }

    public static void main(String[] args) {
        int totalways = tIlingProb(8);
        System.out.println("Totals ways are : " + totalways);
    }
}
