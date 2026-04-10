// package 2dArrays;

public class TargetIn2d {

    public static int count7s(int[][] arr) {
        int count = 0;

        // Outer loop -> rows
        for (int i = 0; i < arr.length; i++) {

            // Inner loop -> columns
            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j] == 7) {
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
