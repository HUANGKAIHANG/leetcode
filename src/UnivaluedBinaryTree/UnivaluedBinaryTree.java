package UnivaluedBinaryTree;

import java.util.ArrayList;
import java.util.List;

public class UnivaluedBinaryTree {
    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode tr1 = new TreeNode(1);
        TreeNode tr2 = new TreeNode(1);
        TreeNode tr3 = new TreeNode(1);
        TreeNode tr4 = new TreeNode(1);
        TreeNode tr5 = new TreeNode(1);
        TreeNode tr6 = new TreeNode(1);
        tr1.left = tr2;
        tr1.right = tr3;
        tr2.left = tr4;
        tr2.right = tr5;
        tr3.right = tr6;
        System.out.println(solution.isUnivalTree(tr1));
        TreeNode tr2_1 = new TreeNode(2);
        TreeNode tr2_2 = new TreeNode(2);
        TreeNode tr2_3 = new TreeNode(2);
        TreeNode tr2_4 = new TreeNode(5);
        TreeNode tr2_5 = new TreeNode(2);
        tr2_1.left = tr2_2;
        tr2_1.right = tr2_3;
        tr2_2.left = tr2_4;
        tr2_2.right = tr2_5;
        System.out.println(solution.isUnivalTree(tr2_1));
    }
}

class Solution {
    boolean isUnivalTree(TreeNode root) {
        int value = root.val;
        List<TreeNode> nodes = new ArrayList<TreeNode>();
        if (root.left != null) {
            nodes.add(root.left);
        }
        if (root.right != null) {
            nodes.add(root.right);
        }
        if (nodes.size() > 0) {
            for (TreeNode node : nodes) {
                if (node.val != value)
                    return false;
                else {
                    if (!isUnivalTree(node))
                        return false;
                }
            }
        }
        return true;
    }
}
