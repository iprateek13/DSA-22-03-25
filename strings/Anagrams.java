package strings;

import java.util.Arrays;

public class Anagrams {

    public static boolean isAnagramBrute(String s1, String s2) {

        // length different → kabhi anagram nahi ho sakte
        if (s1.length() != s2.length())
            return false;

        // String immutable hoti hai → sort ke liye char[] banaya
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        // dono arrays ko sort kiya
        Arrays.sort(arr1); // O(n log n)
        Arrays.sort(arr2); // O(n log n)

        // sorted arrays same hai to anagram
        return Arrays.equals(arr1, arr2);

        // TC: O(n log n)
        // SC: O(n)
    }

    public static boolean isAnagramOPT(String s1, String s2) {

        // length check
        if (s1.length() != s2.length())
            return false;

        int[] count = new int[26]; // sirf lowercase letters ke liye

        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i) - 'a']++; // s1 ka char count++
            count[s2.charAt(i) - 'a']--; // s2 ka char count--
        }

        // agar koi value 0 nahi hai → mismatch
        for (int c : count) {
            if (c != 0)
                return false;
        }

        return true;

        // TC: O(n)
        // SC: O(1)
        // SC- O(1) tabhi hai kyunki:
        // Characters limited hai → 'a' to 'z'
        // Total possibilities fixed = 26
    }

    public static void main(String[] args) {
        System.out.println("Anagramity of strings is : " + isAnagramBrute("listen", "silent")); // true
        System.out.println("Anagramity of strings is : " + isAnagramOPT("listen", "silent"));
    }
}