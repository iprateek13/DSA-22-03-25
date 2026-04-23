package recursion;

public class IsSorted {
    public static boolean issortArr(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1])
            return false;
        return issortArr(arr, i + 1);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 4, 5, 6, 7, 10, 9 };
        System.out.println(issortArr(arr, 0));
    }
}
