package strings;

public class SringComparison {

    public static void main(String[] args) {

        // String creation
        String s1 = "Tony"; // stored in String Pool
        String s2 = "Tony"; // same reference (pool reuse)
        String s3 = new String("Tony"); // new object in heap

        // == → reference comparison (memory address check)
        System.out.println(s1 == s2); // true (same pool memory)
        System.out.println(s1 == s3); // false (pool vs heap)

        // equals() → content comparison
        System.out.println(s1.equals(s3)); // true (same value "Tony")

        // intern() → heap string ko pool me le aata hai
        String s4 = s3.intern();

        // ab reference same ho jayega
        System.out.println(s1 == s4); // true (both in pool)
        System.out.println(s2 == s4); // true

        // final:
        // == → reference check
        // equals() → value/content check
    }
}
