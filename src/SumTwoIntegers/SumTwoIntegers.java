package SumTwoIntegers;

public class SumTwoIntegers {
	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.getSum(1, 2));
		System.out.println(solution.getSum(-2, 3));

	}
}

class Solution {
	int getSum(int a, int b) {
		int result = a ^ b;
		int carry = (a & b) << 1;
		if (carry == 0)
			return result;
		return getSum(result, carry);
	}
}