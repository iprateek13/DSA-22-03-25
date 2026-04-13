import java.util.Arrays;
import java.util.HashSet;

public class DuplicateExist {
    public boolean containsDuplicatebrute(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) { // O(n)
            for (int j = i + 1; j < n; j++) { // O(n)
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean containsDuplicateBetter(int[] nums) {
        Arrays.sort(nums); // O(n log n)

        for (int i = 0; i < nums.length - 1; i++) { // O(n)
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsDuplicateOpt(int[] nums) {

        // Step 1: Create a HashSet to store unique elements
        HashSet<Integer> set = new HashSet<>();

        // Step 2: Traverse the array
        for (int i = 0; i < nums.length; i++) { // Loop runs n times → O(n)

            // Step 3: Check if element already exists in set
            if (set.contains(nums[i])) { // contains() → O(1)
                return true; // duplicate found
            }

            // Step 4: If not present, add element to set
            set.add(nums[i]); // add() → O(1)
        }

        // Step 5: If no duplicates found
        return false;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 1 };

        boolean result = containsDuplicateOpt(nums);

        System.out.println(result); // Output: true
    }

}