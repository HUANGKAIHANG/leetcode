package InvertBinaryTree;

public class InvertBinaryTree {
    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode t4 = new TreeNode(4);
        TreeNode t2 = new TreeNode(2);
        TreeNode t7 = new TreeNode(7);
        TreeNode t1 = new TreeNode(1);
        TreeNode t3 = new TreeNode(3);
        TreeNode t6 = new TreeNode(6);
        TreeNode t9 = new TreeNode(9);
        t4.left = t2;
        t4.right = t7;
        t2.left = t1;
        t2.right = t3;
        t7.left = t6;
        t7.right = t9;
        System.out.println(solution.invertTree(t4).val);
    }
}

class Solution {
    TreeNode invertTree(TreeNode root) {
        if (root != null) {
            if (root.left != null || root.right != null) {
                TreeNode temp = root.left;
                root.left = root.right;
                root.right = temp;
                invertTree(root.left);
                invertTree(root.right);
            }
        }
        return root;
    }
}
