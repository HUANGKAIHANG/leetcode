package BestTimeBuySellStockII;

public class BestTimeBuySellStockII {

	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] prices1 = {7, 1, 5, 3, 6, 4};
		int[] prices2 = {1, 2, 3, 4, 5};
		int[] prices3 = {7, 6, 4, 3, 1};
		System.out.println(solution.maxProfit(prices1));
		System.out.println(solution.maxProfit(prices2));
		System.out.println(solution.maxProfit(prices3));
	}
}

class Solution {
	int maxProfit(int[] prices) {
		int ans = 0;
		if (prices.length > 1) {
			for (int i = 0; i < prices.length - 1; i++) {
				if (prices[i + 1] > prices[i])
					ans += prices[i + 1] - prices[i];
			}
		}
		return ans;
	}
}
