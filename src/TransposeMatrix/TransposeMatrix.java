package TransposeMatrix;

import java.util.Arrays;

public class TransposeMatrix {
    public static void main(String[] args) {
        Solution solution = new Solution();
//        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] a1 = {{1, 2, 3}, {4, 5, 6}};
        int[][] b = solution.transpose(a1);
        for (int[] ints : b) {
            for (int anInt : ints) {
                System.out.print(anInt + ",");
            }
            System.out.println();
        }
    }
}

class Solution {
    int[][] transpose(int[][] A) {
        int[][] ans = new int[A[0].length][A.length];
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[i].length; j++) {
                ans[i][j] = A[j][i];
            }
        }
        return ans;
    }
}
