package SquaresSortedArray;

import java.util.Arrays;

public class SquaresSortedArray {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] a1 = {-4, -1, 0, 3, 10};
        int[] a2 = {-7, -3, 2, 3, 11};
        System.out.println(Arrays.toString(solution.sortedSquares(a1)));
        System.out.println(Arrays.toString(solution.sortedSquares(a2)));
    }
}

class Solution {
    int[] sortedSquares(int[] A) {
        int[] ans = new int[A.length];
        for (int i = 0; i < A.length; i++)
            ans[i] = A[i] * A[i];
        Arrays.sort(ans);
        return ans;
    }
}
