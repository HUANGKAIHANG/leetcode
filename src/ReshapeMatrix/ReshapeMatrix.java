package ReshapeMatrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReshapeMatrix {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] num1 = {{1, 2}, {3, 4}};
        int[][] ans = solution.matrixReshape(num1, 4, 1);
        for (int[] an : ans) System.out.println(Arrays.toString(an));
    }
}

class Solution {
    int[][] matrixReshape(int[][] nums, int r, int c) {
        if (nums.length * nums[0].length != r * c)
            return nums;
        int[][] ans = new int[r][c];
        List<Integer> temp = new ArrayList<>();
        for (int[] num : nums) {
            for (int i : num) temp.add(i);
        }
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[i].length; j++)
                ans[i][j] = temp.get(i * c + j);
        }
        return ans;
    }
}