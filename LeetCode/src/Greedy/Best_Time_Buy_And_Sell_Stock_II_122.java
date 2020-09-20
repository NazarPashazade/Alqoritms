package Greedy;

public class Best_Time_Buy_And_Sell_Stock_II_122 {

    public static void main(String[] args) {
        int arr[] = {7, 1, 5, 3, 6, 4};
        System.out.println("Result = " + maxProfit(arr));
    }

    public static int maxProfit(int[] prices) {
        int sum = 0, diff = 0;

        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i] < prices[i + 1]) {
                diff = prices[i + 1] - prices[i];
                sum += diff;
            }
        }
        return sum;
    }
}
