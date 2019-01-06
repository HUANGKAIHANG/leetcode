package PeakIndexinMountainArray;

public class PeakIndexinMountainArray {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] a = {0, 1, 0};
        int[] b = {0, 2, 1, 0};
        System.out.println(solution.peakIndexInMountainArray(a));
        System.out.println(solution.peakIndexInMountainArray(b));
    }
}

class Solution {
    int peakIndexInMountainArray(int[] A) {
        int i;
        int peak = 0;
        for (i = 0; i < A.length - 1; i++) {
            if (A[i] > A[i + 1]) {
                peak = i;
                break;
            }
        }
        for (; i < A.length - 1; i++) {
            if (A[i] < A[i + 1])
                break;
        }
        if (i == A.length - 1)
            return peak;
        throw null;
    }
}
