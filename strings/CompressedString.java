package strings;

public class CompressedString {
    public static String compress(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) { // O(n)
            int count = 1;

            // next char same hai kya?
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++; // same group me aage badh
            }
            // if (count > 1) {
            // sb.append(str.charAt(i)); // char add
            // sb.append(count); // count add
            // } else {
            // sb.append(str.charAt(i)); // sirf char
            // }
            sb.append(str.charAt(i)); // char add // char to hamesha add hoga

            if (count > 1) {
                sb.append(count); // count add // sirf jab repeat ho
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(compress("aaabbccd")); // a3b2c2d
        System.out.println(compress("abcd")); // abcd
    }
}
