package MoveZeroes;

public class MoveZeroes {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {0,1,0,3,12};
        solution.moveZeroes(nums);
    }
}

class Solution {
    void moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==0){
                for (int j=i+1;j<nums.length;j++){
                    if (nums[j]!=0){
                        int temp = nums[i];
                        nums[i]=nums[j];
                        nums[j]=temp;
                        break;
                    }
                }
            }
        }
    }
}
