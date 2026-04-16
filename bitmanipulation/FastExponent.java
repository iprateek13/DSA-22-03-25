package bitmanipulation;

public class FastExponent {
    public static int bruteExpont(int x, int n) {
        int y = x;
        if (n == 0) {
            return 1;
        }
        for (int i = 1; i < n; i++) {
            x = x * y;
        }
        return x;
    }

    public static int fastExpoBrute(int x, int n) {
        int ans = 1;
        while (n > 0) {
            if (n % 2 == 1) {
                ans = ans * x;
                n = n - 1;
            } else {
                n = n / 2;
                x = x * x;
            }
        }
        return ans;
    }

    public static int fastExpOptimised(int x, int n) {
        int ans = 1;
        while (n > 0) {
            if (n % 2 == 1) {
                ans = ans * x;
            }
            n = n / 2;
            x = x * x;
        }
        return ans;
    }

    public static int FastExponentOptimalBitMani(int x, int n) {
        int ans = 1;
        while (n > 0) {
            if ((n & 1 )== 1) {
                ans = ans * x;
            }
            x=x*x;
            n=n>>1;
        }
        return ans;
    }

    public static void main(String[] args) {
        // System.out.println(fastExpoBrute(2, 10));
        System.out.println(bruteExpont(2, 5));
    }
}
