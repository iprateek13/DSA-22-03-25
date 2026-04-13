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
                     // IMPORTANT:
                // i yaha increment ho raha hai
                // matlab same characters ko for loop dobara visit nahi karega
                // Example: aaabb → i 0→1→2 direct , jb i+1 se i match nhi krega to i next for
                // looop me usi i se badhega , jo i ki value present me rhegi
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
        // TC=O(N)
        // sc = O(1)
        // worst case me (all unique chars) size n ho sakta hai
        // hence SC = O(n) NAHI TO BEST CASE ME O(1)
    }

    public static void main(String[] args) {
        System.out.println(compress("aaabbccd")); // a3b2c2d
        System.out.println(compress("abcd")); // abcd
    }
}
