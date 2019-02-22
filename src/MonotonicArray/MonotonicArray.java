package MonotonicArray;

public class MonotonicArray {
    public static void main(String[] args) {
        int[] a1 = {1, 2, 2, 3};
        int[] a2 = {6, 5, 4, 4};
        int[] a3 = {1, 3, 2};
        int[] a4 = {1, 2, 4, 5};
        int[] a5 = {1, 1, 1};
        int[] a6 = {2, 2, 2, 1, 4, 5};
        Solution solution = new Solution();
        System.out.println(solution.isMonotonic(a1));
        System.out.println(solution.isMonotonic(a2));
        System.out.println(solution.isMonotonic(a3));
        System.out.println(solution.isMonotonic(a4));
        System.out.println(solution.isMonotonic(a5));
        System.out.println(solution.isMonotonic(a6));
    }
}

class Solution {
    boolean isMonotonic(int[] A) {
        if (A.length <= 2)
            return true;
        int now = 0;
        int judgement = 0;
        while (judgement == 0 && (now + 1) <= A.length - 1) {
            judgement = Integer.compare(A[now], A[now + 1]);
            now++;
        }
        for (int i = now - 1; i < A.length - 1; i++) {
            int temp = Integer.compare(A[i], A[i + 1]);
            if (judgement * temp < 0)
                return false;
        }
        return true;
    }
}
