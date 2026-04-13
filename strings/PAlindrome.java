package strings;

public class PAlindrome {

    // BRUTE
    public static boolean palindromeBrute(String names) {
        String names2 = names.toLowerCase();
        String reverse = "";

        for (int i = names2.length() - 1; i >= 0; i--) { // O(n)
            reverse += names2.charAt(i); // O(n)
        }

        return names.equals(reverse); // O(n)
    }
    // TC: O(n^2)
    // SC: O(n)

    // BETTER
    public static boolean isPalindromeBetter(String str) {
        if (str == null)
            return false;

        str = str.toLowerCase();

        StringBuilder sb = new StringBuilder(str);
        String reverse = sb.reverse().toString(); // O(n)

        return str.equals(reverse); // O(n)
    }
    // TC: O(n)
    // SC: O(n)

    // OPTIMAL: two-pointer approach
    public static boolean isPalindromeOptimal(String str) {
        if (str == null)
            return false;

        str = str.toLowerCase();

        int i = 0;
        int n = str.length() - 1;

        while (i < n) { // O(n/2)
            if (str.charAt(i) != str.charAt(n)) {
                return false;
            }
            i++;
            n--;
        }

        return true;
    }
    // TC: O(n)
    // SC: O(1)

    // OPTIMAL: two-pointer approach -For loop
    public static boolean isPalindromeOPT(String str) {
        if (str == null)
            return false;

        str = str.toLowerCase();

        int n = str.length();

        for (int i = 0; i < n / 2; i++) { // O(n/2)
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                return false;
            }
        }

        return true;
    }
    // TC: O(n)
    // SC: O(1)

    public static void main(String[] args) {
        boolean isReverse = palindromeBrute("racecar");
        System.out.println("isRevrse : " + isReverse);
    }
}