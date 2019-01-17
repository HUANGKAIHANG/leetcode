package LeafSimilarTrees;

import java.util.ArrayList;
import java.util.List;

public class LeafSimilarTrees {
    public static void main(String[] args) {
        TreeNode t6 = new TreeNode(6);
        TreeNode t7 = new TreeNode(7);
        TreeNode t4 = new TreeNode(4);
        TreeNode t9 = new TreeNode(9);
        TreeNode t8 = new TreeNode(8);
        TreeNode t2 = new TreeNode(2);
        TreeNode t5 = new TreeNode(5);
        TreeNode t1 = new TreeNode(1);
        TreeNode t3 = new TreeNode(3);
        t2.left = t7;
        t2.right = t4;
        t5.left = t6;
        t5.right = t2;
        t1.left = t9;
        t1.right = t8;
        t3.left = t5;
        t3.right = t1;
        Solution solution = new Solution();
        System.out.println(solution.leafSimilar(t3, t5));
    }
}

class Solution {
    boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> r1 = getSequence(root1);
        List<Integer> r2 = getSequence(root2);
        if (r1.size() != r2.size())
            return false;
        int i;
        for (i = 0; i < r1.size(); i++) {
            if (r1.get(i) != r2.get(i))
                break;
        }
        return i == r1.size();
    }

    private List<Integer> getSequence(TreeNode root) {
        List<Integer> sequence = new ArrayList<>();
        if (root.left == null && root.right == null)
            sequence.add(root.val);
        else {
            if (root.left != null)
                sequence.addAll(getSequence(root.left));
            if (root.right != null)
                sequence.addAll(getSequence(root.right));
        }
        return sequence;
    }
}
