public class KadanesEdgeCase {
    public static int edgeCaseKadanes(int[] arr) {
        int currSum = arr[0];
        int maxSum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            currSum = Math.max(arr[i], currSum + arr[i]);
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 4, -2, 4, -5, 4,  };
        int[] arr2 = { -3, -4, -5, -9, };
        int maxSum = edgeCaseKadanes(arr2);
        System.out.println(maxSum);

    }
}
