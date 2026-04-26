public class RemoveDplicates {

    public static void removeDuplicates(String str, int idx, StringBuilder result, boolean[] map) {

        // Base case
        if (idx == str.length()) {
            System.out.println(result);
            return;
        }

        char currChar = str.charAt(idx);

        // If already visited
        if (map[currChar - 'a']) {
            removeDuplicates(str, idx + 1, result, map);
        } else {
            // Mark and add
            map[currChar - 'a'] = true;
            result.append(currChar);
            removeDuplicates(str, idx + 1, result, map);
        }
    }

    public static void main(String[] args) {
        String str = "appnnacollege";
        removeDuplicates(str, 0, new StringBuilder(), new boolean[26]);
    }
}
