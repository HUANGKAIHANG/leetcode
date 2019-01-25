package MaximumDepthBinaryTree;

public class MaximumDepthBinaryTree {
    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode t1 = new TreeNode(3);
        TreeNode t2 = new TreeNode(9);
        TreeNode t3 = new TreeNode(20);
        TreeNode t4 = new TreeNode(15);
        TreeNode t5 = new TreeNode(7);
        t1.left = t2;
        t1.right = t3;
        t3.left = t4;
        t3.right = t5;
        System.out.println(solution.maxDepth(t1));
    }
}

class Solution {
    int maxDepth(TreeNode root) {
        int depth = 0;
        int left = 0;
        int right = 0;
        if (root != null) {
            depth++;
            if (root.left != null)
                left = maxDepth(root.left);
            if (root.right != null)
                right = maxDepth(root.right);
        }
        depth = left > right ? left + depth : right + depth;
        return depth;
    }
}
