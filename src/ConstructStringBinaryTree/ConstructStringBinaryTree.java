package ConstructStringBinaryTree;

public class ConstructStringBinaryTree {
	public static void main(String[] args) {
		Solution solution = new Solution();
		TreeNode t1 = new TreeNode(1);
		TreeNode t2 = new TreeNode(2);
		TreeNode t3 = new TreeNode(3);
		TreeNode t4 = new TreeNode(4);
		t1.left = t2;
		t1.right = t3;
		t2.left = t4;
		System.out.println(solution.tree2str(t1));
	}
}

class Solution {
	String tree2str(TreeNode t) {
		StringBuffer sb = new StringBuffer();
		if (t != null) {
			sb.append(t.val);
			if (t.left == null && t.right != null)
				sb.append("()");
			if (t.left != null)
				sb.append("(").append(tree2str(t.left)).append(")");
			if (t.right != null)
				sb.append("(").append(tree2str(t.right)).append(")");
		}
		return sb.toString();
	}
}
