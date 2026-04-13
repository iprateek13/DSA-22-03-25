package strings;

public class ComparetoFUNC {
    public static void main(String[] args) {

        String[] str = { "heeloo", "jinamste", "heellooooo" };

        String largestSTR = str[0];

        // index 1 se start
        for (int i = 1; i < str.length; i++) {

            // compare current largest with next elements
            if (largestSTR.compareTo(str[i]) < 0) {
                largestSTR = str[i];
            }
        }

        System.out.println(largestSTR);
    }
}