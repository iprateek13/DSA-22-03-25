package recursion;

public class FactOfN {
    public static int factofn(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factofn(n - 1);
    }

 

    public static void main(String[] args) {
        int fact = factofn(10);
        System.out.println("Factorial is : " + fact);
    

    }
}
