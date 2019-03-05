package FindAllNumbersDisappearedArray;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindAllNumbersDisappearedArray {
	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
		System.out.println(solution.findDisappearedNumbers(nums));
	}
}

class Solution {
	List<Integer> findDisappearedNumbers(int[] nums) {
		Set<Integer> set = new HashSet<>();
		for (int i = 1; i <= nums.length; i++)
			set.add(i);
		for (int num : nums){
			set.remove(num);
		}
		return new ArrayList<>(set);
	}
}
