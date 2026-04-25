public class RemoveDupl {
    public static void removedup(String str, int idx, StringBuilder result, boolean[] map) {
        if (idx == str.length()) {
            System.out.print(result.toString());
            return;
        }
        char ch = str.charAt(idx);
        if (map[ch - 'a']) {
            removedup(str, idx + 1, result, map);
        } else {
            map[ch - 'a'] = true;
            removedup(str, idx + 1, result.append(ch), map);
        }
    }

    public static void main(String[] args) {
        String str = "apnnacollege";
        removedup(str, 0, new StringBuilder(""), new boolean[26]);

    }
}
