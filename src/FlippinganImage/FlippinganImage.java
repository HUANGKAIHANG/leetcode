package FlippinganImage;

import java.util.Arrays;

public class FlippinganImage {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] a = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        int[][] b = {{1, 1, 0, 0}, {1, 0, 0, 1}, {0, 1, 1, 1}, {1, 0, 1, 0}};
        System.out.println(Arrays.deepToString(solution.flipAndInvertImage(a)));
        System.out.println(Arrays.deepToString(solution.flipAndInvertImage(b)));
    }
}

class Solution {
    int[][] flipAndInvertImage(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            int[] temp = A[i].clone();
            for (int j = 0; j < temp.length; j++) {
                A[i][j] = temp[temp.length - 1 - j];
                if (A[i][j] == 0)
                    A[i][j] = 1;
                else
                    A[i][j] = 0;
            }
        }
        return A;
    }
}
