package NRepeatedin2NArray;

public class NRepeatedin2NArray {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] a1 = {1, 2, 3, 3};
        int[] a2 = {2, 1, 2, 5, 3, 2};
        int[] a3 = {5, 1, 5, 2, 5, 3, 5, 4};
        System.out.println(solution.repeatedNTimes(a1));
        System.out.println(solution.repeatedNTimes(a2));
        System.out.println(solution.repeatedNTimes(a3));
    }
}

class Solution {
    int repeatedNTimes(int[] A) {
        StringBuffer a = new StringBuffer();
        for (int i = 0; i < A.length; i++) {
            if (a.indexOf(String.valueOf(A[i])) != -1)
                return A[i];
            a.append(A[i]);
        }
        throw null;
    }
}
