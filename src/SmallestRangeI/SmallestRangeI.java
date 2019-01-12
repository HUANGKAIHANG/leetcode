package SmallestRangeI;

import java.util.Arrays;

public class SmallestRangeI {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] a1 = {1};
        int k1 = 0;
        int[] a2 = {0, 10};
        int k2 = 2;
        int[] a3 = {1, 3, 6};
        int k3 = 3;
        System.out.println(solution.smallestRangeI(a1, k1));
        System.out.println(solution.smallestRangeI(a2, k2));
        System.out.println(solution.smallestRangeI(a3, k3));
    }
}

class Solution {
    int smallestRangeI(int[] A, int K) {
        int min = Arrays.stream(A).min().getAsInt();
        int max = Arrays.stream(A).max().getAsInt();
        if (min + K >= max - K)
            return 0;
        return (max - K) - (min + K);
    }
}
