package FairCandySwap;

import java.util.Arrays;

public class FairCandySwap {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] A1 = {1, 1};
        int[] B1 = {2, 2};
        int[] A2 = {1, 2};
        int[] B2 = {2, 3};
        int[] A3 = {2};
        int[] B3 = {1, 3};
        int[] A4 = {1, 2, 5};
        int[] B4 = {2, 4};
        System.out.println(Arrays.toString(solution.fairCandySwap(A1, B1)));
        System.out.println(Arrays.toString(solution.fairCandySwap(A2, B2)));
        System.out.println(Arrays.toString(solution.fairCandySwap(A3, B3)));
        System.out.println(Arrays.toString(solution.fairCandySwap(A4, B4)));
    }
}

class Solution {
    int[] fairCandySwap(int[] A, int[] B) {
        int[] ans = new int[2];
        int sumA = 0, sumB = 0;
        for (int i1 : A)
            sumA = sumA + i1;
        for (int i1 : B)
            sumB = sumB + i1;
        int diff = (sumA - sumB) / 2;
        boolean find = false;
        for (int i1 : A) {
            for (int i : B) {
                if (i1 - i == diff) {
                    find = true;
                    ans[0] = i1;
                    ans[1] = i;
                    break;
                }
            }
            if (find)
                break;
        }
        return ans;
    }
}
