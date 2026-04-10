// package 2dArrays;

public class Target2dForEach {

    public static int count7s(int[][] arr) {
        int count = 0;

        for (int[] row : arr) { // directly row access
            for (int val : row) { // directly element access
                if (val == 7) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[][] array = { { 4, 7, 8 }, { 8, 8, 7 } };
        System.out.println(count7s(array)); // Output: 2
    }
}
