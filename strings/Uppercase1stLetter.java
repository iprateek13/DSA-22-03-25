package strings;

public class Uppercase1stLetter {

    public static String toUppercase(String str) {

        StringBuilder sb = new StringBuilder(""); // result banane ke liye

        char ch = Character.toUpperCase(str.charAt(0)); // first char uppercase
        sb.append(ch); // add first char

        for (int i = 1; i < str.length(); i++) {

            if (str.charAt(i) == ' ' && i < str.length() - 1) {

                sb.append(str.charAt(i)); // space bhi add karna hai

                i++; // next char pe jump (new word start)

                sb.append(Character.toUpperCase(str.charAt(i))); // next char uppercase

            } else {

                sb.append(str.charAt(i)); // normal char add
            }
        }

        return sb.toString(); // final string return
        //Total TC : O(n) ✔✔
        // SC : O(n) (result ke liye only)
    }

    public static void main(String[] args) {
        String str = "hi, i am prateek";
        System.out.println(toUppercase(str));
    }
}