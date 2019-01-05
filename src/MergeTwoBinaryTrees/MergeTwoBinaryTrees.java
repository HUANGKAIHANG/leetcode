package MergeTwoBinaryTrees;

public class MergeTwoBinaryTrees {
    public static void main(String[] args) {
        TreeNode t1_1 = new TreeNode(1);
        TreeNode t1_2 = new TreeNode(3);
        TreeNode t1_3 = new TreeNode(2);
        TreeNode t1_4 = new TreeNode(5);
        t1_1.left = t1_2;
        t1_1.right = t1_3;
        t1_2.left = t1_4;
        TreeNode t2_1 = new TreeNode(2);
        TreeNode t2_2 = new TreeNode(1);
        TreeNode t2_3 = new TreeNode(3);
        TreeNode t2_4 = new TreeNode(4);
        TreeNode t2_5 = new TreeNode(7);
        t2_1.left = t2_2;
        t2_1.right = t2_3;
        t2_2.right = t2_4;
        t2_3.right = t2_5;
        Solution solution = new Solution();
        TreeNode mergeTree = solution.mergeTrees(t1_1, t2_1);
        System.out.println(mergeTree.val);
        System.out.println(mergeTree.left.val);
        System.out.println(mergeTree.right.val);
        System.out.println(mergeTree.left.left.val);
        System.out.println(mergeTree.left.right.val);
//        System.out.println(mergeTree.right.left.val);
        System.out.println(mergeTree.right.right.val);
    }
}

class Solution {
    TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) {
            return null;
        } else {
            TreeNode current = new TreeNode(0);
            if (t1 == null) {
                current.val = t2.val;
            } else if (t2 == null) {
                current.val = t1.val;
            } else {
                current.val = t1.val + t2.val;
            }

            if (t1 == null) {
                current.left = mergeTrees(null, t2.left);
                current.right = mergeTrees(null, t2.right);
            } else if (t2 == null) {
                current.left = mergeTrees(t1.left, null);
                current.right = mergeTrees(t1.right, null);
            } else {
                current.left = mergeTrees(t1.left, t2.left);
                current.right = mergeTrees(t1.right, t2.right);
            }

            return current;
        }
    }
}
