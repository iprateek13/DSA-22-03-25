import java.util.*;

public class FindAllOccurenceInRotated {

    // Linear approach (best for rotated array)
    public static List<Integer> findAll(int[] arr, int target) {

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) { // O(n)
            if (arr[i] == target) {
                result.add(i);
            }
        }

        return result;
    }

    public static List<Integer> findAllOccur(int[] arr, int target) {

        List<Integer> result = new ArrayList<>();

        int index = search(arr, target); // O(log n)

        if (index == -1)
            return result;

        // add found index
        result.add(index);

        // Expand sirf contiguous duplicates ke liye hota hai
        // check left side ki aur target exits krte hai ya nhi
        // left expand
        int i = index - 1;
        while (i >= 0 && arr[i] == target) { // O(k)
            result.add(i);
            i--;
        }

        // check right side ki aur target exits krte hai ya nhi
        // right expand
        int j = index + 1;
        while (j < arr.length && arr[j] == target) { // O(k)
            result.add(j);
            j++;
        }

        return result;
        // worst case me dono O(n) TC hi lgega
    }

    // Rotated binary search (returns any one index)
    public static int search(int[] arr, int target) {

        int start = 0, end = arr.length - 1;

        while (start <= end) { // O(log n) avg

            int mid = start + (end - start) / 2;

            if (arr[mid] == target)
                return mid;

            // handle duplicates
            if (arr[start] == arr[mid] && arr[mid] == arr[end]) {
                start++;
                end--;
                continue;
            }

            // left sorted
            if (arr[start] <= arr[mid]) {

                if (target >= arr[start] && target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            } else { // right sorted

                if (target > arr[mid] && target <= arr[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = { 3, 3, 4, 5, 6, 7, 0, 1, 2 };
        int target = 3;
        // Binary + expand → only when duplicates ek saath ho //{ 3, 3, 4, 5, 6, 7, 0,
        // 1}
        // 2, 3 };
        // Linear scan → jab duplicates scattered ho ya sath ho ,kahi pe bhi kam krega
        // (rotated array)
        System.out.println(findAllOccur(arr, target)); // [0, 8]
    }
}