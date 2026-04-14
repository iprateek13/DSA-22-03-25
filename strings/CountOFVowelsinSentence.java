package strings;

public class CountOFVowelsinSentence {
    public static int CountVowelSentence(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));
            // only check vowels (space automatically ignored)
            if (ch == 'a' || ch == 'e'
                    || ch == 'i' || ch == 'o'
                    || ch == 'u') {
                count++;
                // Issue
                // Har baar 5 comparisons
                // Code thoda messy
            }
        }
        return count;
    }

    public static int CountVowelSentenceOpt(String str) {
        int count = 0;
        String vowels = "aeiou";

        for (int i = 0; i < str.length(); i++) { // O(n)
            char ch = Character.toLowerCase(str.charAt(i));

            if (vowels.indexOf(ch) != -1) { // O(1)
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int count = CountVowelSentence("Hi, I am Prateek Agrawaal");
        System.out.println("coutnt of vowel in this Sentence is : " + count);
    }
}
