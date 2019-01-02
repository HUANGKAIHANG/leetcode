package DeleteColumnsMakeSorted;

public class DeleteColumnsMakeSorted {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] A = {"abcdef", "uvwxyz"};
        String[] B = {"cba", "daf", "ghi"};
        String[] C = {"a", "b"};
        String[] D = {"zyx", "wvu", "tsr"};
        System.out.println(solution.minDeletionSize(A));
        System.out.println(solution.minDeletionSize(B));
        System.out.println(solution.minDeletionSize(C));
        System.out.println(solution.minDeletionSize(D));
    }
}

class Solution {
    int minDeletionSize(String[] A) {
        int count = 0;
        for (int i = 0; i < A[0].length(); i++) {
            for (int j = 1; j < A.length; j++) {
                if (A[j].charAt(i) < A[j - 1].charAt(i)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}