public class OptimsedDiagSum {
    public static int diagSumOpt(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][i];
            if (i != arr.length - 1 - i) {
                sum += arr[i][arr.length - 1 - i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] arr = { { 2, 3, 4 }, { 4, 5, 6 }, { 4, 6, 7 } };
        int sum = diagSumOpt(arr);
        System.out.println("Total Diagonal Sum: " + sum);

    }
}
