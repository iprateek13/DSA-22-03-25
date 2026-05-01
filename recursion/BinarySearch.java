public class BinarySearch {
    public static int binarySearchRecursive(int[] arr, int target, int si, int ei) {
        if (si <= ei) {
            int mid = si + (ei - si) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] <= target) {
                return binarySearchRecursive(arr, target, mid + 1, ei);
            } else {
                return binarySearchRecursive(arr, target, si, mid - 1);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println("index is : " + binarySearchRecursive(arr, 6, 0, arr.length - 1));
    }
}
