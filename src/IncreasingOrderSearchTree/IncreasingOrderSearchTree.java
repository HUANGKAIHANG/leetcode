package IncreasingOrderSearchTree;

import java.util.ArrayList;
import java.util.List;

public class IncreasingOrderSearchTree {
    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(5);
        TreeNode t6 = new TreeNode(6);
        TreeNode t7 = new TreeNode(7);
        TreeNode t8 = new TreeNode(8);
        TreeNode t9 = new TreeNode(9);
        t5.left = t3;
        t5.right = t6;
        t3.left = t2;
        t3.right = t4;
        t2.left = t1;
        t6.right = t8;
        t8.left = t7;
        t8.right = t9;
        System.out.println(solution.increasingBST(t5).val);
        System.out.println(solution.increasingBST(t5).right.val);
    }
}

class Solution {
    TreeNode increasingBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root != null)
            list = findSequence(root);
        TreeNode ans = new TreeNode(list.get(0));
        TreeNode current = ans;
        for (int i = 1; i < list.size(); i++) {
            current.right = new TreeNode(list.get(i));
            current = current.right;
        }
        return ans;
    }

    private List<Integer> findSequence(TreeNode root) {
        List<Integer> sequence = new ArrayList<>();
        if (root.left != null)
            sequence.addAll(findSequence(root.left));
        sequence.add(root.val);
        if (root.right != null)
            sequence.addAll(findSequence(root.right));
        return sequence;
    }
}