package MaxConsecutiveOnes;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 1, 0, 1, 1, 1};
        System.out.println(solution.findMaxConsecutiveOnes(nums));
    }
}

class Solution {
    int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1)
                temp++;
            else if (nums[i] == 0) {
                max = Math.max(max, temp);
                temp = 0;
            }
            if (i == nums.length - 1)
                max = Math.max(max, temp);
        }
        return max;
    }
}