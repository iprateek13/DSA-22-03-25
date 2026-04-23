package recursion;

public class LastOccur {
    public static int lastOccur(int[] arr, int i, int target) {
        if (i == arr.length) {
            return -1;
        }
        int lastOccur = lastOccur(arr, i + 1, target);
        if (lastOccur != -1) {
            return lastOccur;
        }
        if (arr[i] == target) {
            return i;
        }
        return lastOccur;

    }

    public static int lastOccur1(int[] arr, int i, int target) {
        if (i == arr.length) {
            return -1;
        }
        int lastOccur = lastOccur(arr, i + 1, target);
        if (lastOccur == -1 && arr[i] == target) {
            return i;
        }
        return lastOccur;

    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 3, 5, 4 };
        int index = lastOccur(arr, 0, 3);
        System.out.println(lastOccur1(arr, 0, 3));
        System.out.println("index is : " + index);
    }
}
