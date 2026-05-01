public class FriendPairing {
    public static int friendpair(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        int single = friendpair(n - 1);
        int pair = (n - 1) * friendpair(n - 2);
        return single+pair;
    }

    public static void main(String[] args) {
        int totalways = friendpair(3);
        System.out.println(totalways);
    }
}
