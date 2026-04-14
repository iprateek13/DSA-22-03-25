package strings;

public class CountOFVowelsinWord {
    public static int countVowelsInAWord(String str) {
        int count = 0;
        int n = str.length() - 1;
        for (int i = 0; i <= n; i++) {// O(n)
            char ch = Character.toLowerCase(str.charAt(i));// O(1)
            if (ch == 'a' || ch == 'e'
                    || ch == 'i' || ch == 'o'
                    || ch == 'u') {
                count++;
            }
        }
        return count;
        // Total TC = O(n)
        // SC= O(1)
    }

    public static int countVowelsOptimal(String str) {
        int count = 0;
        String vowels = "aeiou";

        for (int i = 0; i < str.length(); i++) { // O(n)
            char ch = Character.toLowerCase(str.charAt(i));

            if (vowels.indexOf(ch) != -1) { // O(1) (fixed size = 5)
                count++;
            }
        }

        return count;
        // .indexof() --> Returns ?
        // mil gaya to → index (0-based indexing)
        // nahi mila → -1
    }

    public static void main(String[] args) {
        int count = countVowelsInAWord("prAteek");
        System.out.println("COunt of vowels is " + count);
    }
}
