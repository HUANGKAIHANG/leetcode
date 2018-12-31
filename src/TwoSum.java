import java.util.Arrays;

public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {3, 2, 3};
        int target = 6;
        Solution solution = new Solution();
        int[] indices = solution.twoSum(nums, target);
        System.out.println(Arrays.toString(indices));
    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] indicis = new int[2];
        for (int i = 0; i < nums.length-1; i++) {
           for (int j=i+1; j<nums.length; j++){
               if (nums[i]+nums[j]==target){
                   indicis[0]=i;
                   indicis[1]=j;
               }
           }
        }
        return indicis;
    }
}
