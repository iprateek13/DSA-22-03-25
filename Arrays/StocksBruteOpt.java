public class StocksBruteOpt {

    // Brute Force Approach
    // TC: O(n^2) -> nested loops
    // SC: O(1)
    public static int maxProfitBrute(int[] prices) {
        int n = prices.length;
        int maxProfit = 0;

        for (int i = 0; i < n; i++) { // O(n)
            for (int j = i + 1; j < n; j++) { // O(n)
                int profit = prices[j] - prices[i];
                maxProfit = Math.max(maxProfit, profit);
            }
        }
        return maxProfit;
    }

    // Optimal Approach
    // TC: O(n) -> single loop
    // SC: O(1) -> no extra space
    public static int maxProfit(int[] prices) {
        int minPrice = prices[0]; // track minimum so far
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) { // O(n)
            int profit = prices[i] - minPrice; // sell today
            maxProfit = Math.max(maxProfit, profit);
            minPrice = Math.min(minPrice, prices[i]); // update buy
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] arr = { 7, 1, 5, 3, 6, 4 };

        System.out.println(maxProfit(arr)); // 5
        System.out.println(maxProfitBrute(arr)); // 5
    }
}