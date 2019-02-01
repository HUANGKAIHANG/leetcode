package AverageLevelsBinaryTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AverageLevelsBinaryTree {
    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode t3 = new TreeNode(3);
        TreeNode t9 = new TreeNode(9);
        TreeNode t20 = new TreeNode(20);
        TreeNode t15 = new TreeNode(15);
        TreeNode t7 = new TreeNode(7);
        t3.left = t9;
        t3.right = t20;
        t20.left = t15;
        t20.right = t7;
        System.out.println(Arrays.toString(solution.averageOfLevels(t3).toArray(new Double[0])));
    }
}

class Solution {
    List<Double> averageOfLevels(TreeNode root) {
        List<Double> ans = new ArrayList<>();
        if (root != null) {
            List<TreeNode> current = new ArrayList<>();
            current.add(root);
            while (current.size() != 0) {
                List<TreeNode> temp = new ArrayList<>();
                double sum = 0d;
                for (TreeNode treeNode : current) {
                    sum = sum + treeNode.val;
                    if (treeNode.left != null)
                        temp.add(treeNode.left);
                    if (treeNode.right != null)
                        temp.add(treeNode.right);
                }
                ans.add(sum / current.size());
                current = temp;
            }
        }
        return ans;
    }
}
