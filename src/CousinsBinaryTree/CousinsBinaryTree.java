package CousinsBinaryTree;

public class CousinsBinaryTree {
    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode5 = new TreeNode(5);
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode2.right = treeNode4;
        treeNode3.right = treeNode5;
        System.out.println(solution.isCousins(treeNode1, 5, 4));
    }
}

class Solution {
    private int depthX = -1;
    private int depthY = -1;
    private TreeNode parentX = null;
    private TreeNode parentY = null;

    boolean isCousins(TreeNode root, int x, int y) {
        findDepthAndParent(root, x, y, 0, null);
        return depthX == depthY && parentY != parentX;
    }

    private void findDepthAndParent(TreeNode root, int x, int y, int depth, TreeNode parent) {
        if (root == null)
            return;
        if (root.val == x) {
            depthX = depth;
            parentX = parent;
        } else if (root.val == y) {
            depthY = depth;
            parentY = parent;
        }
        findDepthAndParent(root.left, x, y, depth + 1, root);
        findDepthAndParent(root.right, x, y, depth + 1, root);
    }
}