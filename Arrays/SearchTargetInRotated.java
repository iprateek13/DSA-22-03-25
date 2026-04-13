import java.util.Scanner;

public class SearchTargetInRotated {

    public static int searchinRotated(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }

            // handle duplicates
            if (arr[start] == arr[mid] && arr[mid] == arr[end]) {
                start++;
                end--;
                continue;
            }
            // finding which half is sorted
            if (arr[start] <= arr[mid]) {// left half is sorted
                if (target >= arr[start] && target <= arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {// right half is sorted
                if (target >= arr[mid] && target <= arr[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int[] arr = { 3, 4, 5, 6, 7, 0, 1, 2, 3 };
        int index = searchinRotated(arr, target);
        System.out.println("Index is : " + index);
        sc.close();
    }
}
