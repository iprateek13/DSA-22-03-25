import java.util.Scanner;

public class CountofTArget {

    // BRUTE APPROACH (Always works)
    public static int count7(int[][] arr, int target) {

        int count = 0;

        // Outer loop → rows
        // TC: O(n)
        for (int i = 0; i < arr.length; i++) {

            // Inner loop → columns
            // TC: O(m)
            for (int j = 0; j < arr[0].length; j++) {

                // constant operation
                if (arr[i][j] == target) {
                    count++;
                }
            }
        }

        // Total TC = O(n * m)
        // SC = O(1) (no extra space used)

        return count;
    }

    // BETTER APPROACH (Binary Search per row)
    // Condition: Har row sorted honi chahiye
    public static int count7better(int[][] arr, int target) {

        int count = 0;

        // Loop over rows
        // TC: O(n)
        for (int i = 0; i < arr.length; i++) {

            // First occurrence → O(log m)
            int first = firstOccurrence(arr[i], target);

            // Last occurrence → O(log m)
            int last = lastOccurrence(arr[i], target);

            // constant work
            if (first != -1) {
                count += (last - first + 1);
            }
        }

        // Total TC = O(n * log m)
        // SC = O(1)

        return count;
    }

    // First Occurrence (Binary Search)
    public static int firstOccurrence(int[] row, int target) {

        int left = 0, right = row.length - 1;
        int ans = -1;

        // Binary search loop
        // TC: O(log m)
        while (left <= right) {

            int mid = (left + right) / 2;

            if (row[mid] == target) {
                ans = mid; // store answer
                right = mid - 1; // go LEFT (first occurrence)
            }

            else if (row[mid] < target) {
                left = mid + 1; // go RIGHT
            }

            else {
                right = mid - 1; // go LEFT
            }
        }

        // TC = O(log m)
        // SC = O(1)

        return ans;
    }

    // 🔹 Last Occurrence (Binary Search)
    public static int lastOccurrence(int[] row, int target) {

        int left = 0, right = row.length - 1;
        int ans = -1;

        // Binary search loop
        // TC: O(log m)
        while (left <= right) {

            int mid = (left + right) / 2;

            if (row[mid] == target) {
                ans = mid; // store answer
                left = mid + 1; // go RIGHT (last occurrence)
            }

            else if (row[mid] < target) {
                left = mid + 1; // go RIGHT
            }

            else {
                right = mid - 1; // go LEFT
            }
        }

        // TC = O(log m)
        // SC = O(1)

        return ans;
    }

    // OPTIMAL APPROACH (Staircase - Bottom Left)
    // Condition: Row + Column sorted
    public static int countTarget(int[][] arr, int target) {

        int rows = arr.length;
        int cols = arr[0].length;

        int row = rows - 1; // start bottom-left
        int col = 0;

        int count = 0;

        // Loop runs at most (n + m) steps
        // TC: O(n + m)
        while (row >= 0 && col < cols) {

            if (arr[row][col] == target) {
                count++; // found
                row--; // move UP
            }

            else if (arr[row][col] > target) {
                row--; // move UP (smaller values)
            }

            else {
                col++; // move RIGHT (larger values)
            }
        }

        // TC = O(n + m)
        // SC = O(1)

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] arr = {
                { 2, 3, 4 },
                { 4, 5, 6 },
                { 4, 6, 7 }
        };

        int target = sc.nextInt();

        // int count = count7(arr, target); // brute
        int count = count7better(arr, target); // better
        // int count = countTarget(arr, target); // optimal

        System.out.println("Count is : " + count);

        sc.close();
    }
}