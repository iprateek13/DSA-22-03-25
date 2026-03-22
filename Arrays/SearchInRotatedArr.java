public class SearchInRotatedArr {
    public static int SearchTarget(int arr[], int n, int target) {
        int i = 0;
        int j = n - 1;
        while (i <= j) {
            int mid = i + (j - i) / 2;
            if (arr[mid] == target)
                return mid;
            // left half is sorted
            if (arr[i] <= arr[mid]) {
                if (arr[i] <= target && target <= arr[mid]) {
                    j = mid - 1;
                } else {
                    i = mid + 1;
                }

            } else {
                // right half is sorted
                if (arr[mid] <= target && target <= arr[j]) {
                    i = mid + 1;
                } else {
                    j = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2, 3 };
        int n = arr.length;
        int target = 3;
        int IndexOfTarget = SearchTarget(arr, n, target);
        System.out.println("Index of the Target is : " + IndexOfTarget);
    }
}
