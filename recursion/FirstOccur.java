package recursion;

public class FirstOccur {
    public static int firstOccurence(int[] arr, int i, int target) {
        if (i > arr.length - 1)
            return -1;
        if (arr[i] == target)
            return i;
        return firstOccurence(arr, i + 1, target);
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 3, 4, 5 };
        System.out.println("First occurence index is : "+firstOccurence(arr, 0, 4));
    }
}
