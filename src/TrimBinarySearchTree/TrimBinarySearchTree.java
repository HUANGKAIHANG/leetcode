package TrimBinarySearchTree;

public class TrimBinarySearchTree {
    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode t0 = new TreeNode(0);
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
//        t1.left=t0;t1.right=t2;
//        t3.left=t0;t3.right=t4;
//        t0.right=t2;t2.left=t1;
//        t2.left=t1;
        t3.left = t0;
        t3.right = t4;
        t0.right = t2;
        t2.left = t1;
        System.out.println(solution.trimBST(t3, 1, 3).val);
        System.out.println(solution.trimBST(t3, 1, 3).left.val);
    }
}

class Solution {
    TreeNode trimBST(TreeNode root, int L, int R) {
        if (root == null)
            return null;
        if (root.val < L)
            return trimBST(root.right, L, R);
        if (root.val > R)
            return trimBST(root.left, L, R);
        root.left = trimBST(root.left, L, R);
        root.right = trimBST(root.right, L, R);
        return root;
    }
}
