package strings;

public class StringsCoreMemory {

    public static void main(String[] args) {

        // String literals (Stored in String Constant Pool - SCP)
        String str1 = "Tony";
        String str2 = "Tony";

        // Created using new keyword (Stored in Heap)
        String str3 = new String("Tony");

        // 1. Compare references (SCP)
        System.out.println("str1 == str2: " + (str1 == str2)); // true

        // Identity hash codes (memory reference approx)
        System.out.println("str1 hash: " + System.identityHashCode(str1));
        System.out.println("str2 hash: " + System.identityHashCode(str2));

        // 2. Compare SCP vs Heap
        System.out.println("str1 == str3: " + (str1 == str3)); // false

        System.out.println("str3 hash: " + System.identityHashCode(str3));

        // 3. Using intern() → brings reference to SCP
        String str4 = new String("Tony").intern();

        System.out.println("str1 == str4: " + (str1 == str4)); // true
        System.out.println("str4 hash: " + System.identityHashCode(str4));
    }
}
