package LargestPerimeterTriangle;

import java.util.Arrays;

public class LargestPerimeterTriangle {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] a1 = {2, 1, 2};
        int[] a2 = {1, 2, 1};
        int[] a3 = {3, 2, 3, 4};
        int[] a4 = {3, 6, 2, 3};
        System.out.println(solution.largestPerimeter(a1));
        System.out.println(solution.largestPerimeter(a2));
        System.out.println(solution.largestPerimeter(a3));
        System.out.println(solution.largestPerimeter(a4));
    }
}

class Solution {
    int largestPerimeter(int[] A) {
        Arrays.sort(A);
        int max = 0;
        for (int i = A.length - 1; i >= 2; i--) {
            int a = A[i];
            int b = A[i - 1];
            int c = A[i - 2];
            if (a + b > c && a + c > b && b + c > a) {
                max = a + b + c;
                break;
            }
        }
        return max;
    }
}
