package SearchBinarySearchTree;

public class SearchBinarySearchTree {
    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(4);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(7);
        TreeNode t4 = new TreeNode(1);
        TreeNode t5 = new TreeNode(3);
        t1.left=t2;
        t1.right=t3;
        t2.left=t4;
        t2.right=t5;
        Solution solution = new Solution();
        System.out.println(solution.searchBST(t1,5));
    }
}

class Solution {
    TreeNode searchBST(TreeNode root, int val) {
        if (root==null)
            return null;
        if (root.val==val)
            return root;
        if (val<root.val){
            return searchBST(root.left, val);
        }else{
            return searchBST(root.right,val);
        }
    }
}
