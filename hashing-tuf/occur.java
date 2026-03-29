
import java.util.*;

public class occur {

    public static void main(String[] args) {
        String str = "prateek";

        int[] hash = new int[26]; // for a-z

        // counting frequency
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            hash[ch - 'a']++;
        }

        // printing result
        for (int i = 0; i < 26; i++) {
            if (hash[i] > 0) {
                char ch = (char) (i + 'a');
                System.out.println(ch + " -> " + hash[i]);
            }
        }
    }
}
