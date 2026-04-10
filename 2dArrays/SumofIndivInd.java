
public class SumofIndivInd {

    public static int sumSecondRow(int[][] nums) {
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (i == 1) {
                    sum += nums[i][j];
                }
            }
        }

        return sum;
    }

    // optimal because row is fixed
    public static int sumSecondRowonly(int[][] nums) {
        int sum = 0;

        for (int j = 0; j < nums[1].length; j++) {
            sum += nums[1][j];
        }

        return sum;
    }

    public static int sumSecondRowok(int[][] nums) {
        // for-each
        int sum = 0;

        for (int val : nums[1]) {
            sum += val;
        }

        return sum;
    }

    public static void main(String[] args) {
        int[][] nums = { { 1, 4, 9 }, { 11, 4, 3 }, { 2, 2, 3 } };
        System.out.println(sumSecondRow(nums)); // 18
    }
}
