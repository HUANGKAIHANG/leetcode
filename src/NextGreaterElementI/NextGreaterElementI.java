package NextGreaterElementI;

import java.util.Arrays;

public class NextGreaterElementI {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};
        int[] nums3 = {2, 4};
        int[] nums4 = {1, 2, 3, 4};
        System.out.println(Arrays.toString(solution.nextGreaterElement(nums1, nums2)));
        System.out.println(Arrays.toString(solution.nextGreaterElement(nums3, nums4)));
    }
}

class Solution {
    int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            boolean find = false;
            boolean exist = false;
            for (int i2 : nums2) {
                if (nums1[i] == i2)
                    exist = true;
                if (exist && i2 > nums1[i]) {
                    find = true;
                    ans[i] = i2;
                    break;
                }
            }
            if (!find)
                ans[i] = -1;
        }
        return ans;
    }
}
