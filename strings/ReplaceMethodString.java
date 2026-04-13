package strings;

public class ReplaceMethodString {

    public static void main(String[] args) {

        // original string
        String str = "ApnaCollege";

        // 1. remove 'l'
        String removeL = str.replace("l", ""); // sab 'l' remove

        // 2. replace 'l' with 'x'
        String replaceChar = str.replace('l', 'x'); // l → x

        // 3. replace word
        String replaceWord = str.replace("College", "School"); // substring replace

        // 4. replaceAll (regex based)
        String replaceAllExample = str.replaceAll("l", "*"); // sab l → *

        // 5. replaceFirst (sirf pehla match)
        String replaceFirstExample = str.replaceFirst("l", "#"); // first l → #

        // print outputs
        System.out.println("Original: " + str);
        System.out.println("Remove l: " + removeL);
        System.out.println("Replace l with x: " + replaceChar);
        System.out.println("Replace word: " + replaceWord);
        System.out.println("replaceAll: " + replaceAllExample);
        System.out.println("replaceFirst: " + replaceFirstExample);
    }

}
