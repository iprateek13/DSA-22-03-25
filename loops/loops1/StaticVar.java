
public class StaticVar {
    static int x = 10;

    public static void staticvar() {
        int x = 15;
        System.out.println(x);
        x = 16;
        System.out.println(x);
    }

    public static void main(String[] args) {
        staticvar();
    }
}
