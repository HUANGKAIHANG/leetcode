package ArrayPartitionI;

import java.util.Arrays;

public class ArrayPartitionI {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 4, 3, 2};
        System.out.println(solution.arrayPairSum(nums));
    }
}

class Solution {
    int arrayPairSum(int[] nums) {
//        for (int i = 0; i < nums.length - 1; i++) {
//            for (int j = 0; j < nums.length - 1 - i; j++) {
//                if (nums[j] > nums[j + 1]) {
//                    int temp = nums[j + 1];
//                    nums[j + 1] = nums[j];
//                    nums[j] = temp;
//                }
//            }
//        }
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i = i + 2)
            sum = sum + Math.min(nums[i], nums[i + 1]);
        return sum;
    }
}
