package IntersectionTwoArrays;

import java.util.*;

public class IntersectionTwoArrays {
	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] a1 = {1, 2, 2, 1};
		int[] a2 = {2, 2};
		int[] a3 = {4, 9, 5};
		int[] a4 = {9, 4, 9, 8, 4};
		System.out.println(Arrays.toString(solution.intersection(a1, a2)));
		System.out.println(Arrays.toString(solution.intersection(a3, a4)));
	}
}

class Solution {
	int[] intersection(int[] nums1, int[] nums2) {
		Set<Integer> ans = new HashSet<>();
		for (int i1 : nums1) {
			for (int i : nums2) {
				if (i == i1) {
					ans.add(i1);
					break;
				}
			}
		}
		int[] a = new int[ans.size()];
		int i = 0;
		for (int val : ans)
			a[i++] = val;
		return a;
	}
}
