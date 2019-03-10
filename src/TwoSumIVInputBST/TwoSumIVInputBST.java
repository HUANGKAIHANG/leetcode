package TwoSumIVInputBST;

import java.util.ArrayList;
import java.util.List;

public class TwoSumIVInputBST {
	public static void main(String[] args) {
		Solution solution = new Solution();
		TreeNode t5 = new TreeNode(5);
		TreeNode t3 = new TreeNode(3);
		TreeNode t6 = new TreeNode(6);
		TreeNode t2 = new TreeNode(2);
		TreeNode t4 = new TreeNode(4);
		TreeNode t7 = new TreeNode(7);
		t5.left = t3;
		t5.right = t6;
		t3.left = t2;
		t3.right = t4;
		t6.right = t7;
		int target1 = 9;
		int target2 = 28;
		System.out.println(solution.findTarget(t5, target1));
		System.out.println(solution.findTarget(t5, target2));
	}
}

class Solution {
	boolean findTarget(TreeNode root, int k) {
		boolean ans = false;
		List<Integer> tree;
		if (root != null) {
			tree = findAllVal(root);
			for (int i = 0; i < tree.size() - 1; i++) {
				for (int j = i + 1; j < tree.size(); j++) {
					if (tree.get(i) + tree.get(j) == k) {
						ans = true;
						break;
					}
				}
				if (ans)
					break;
			}
		}
		return ans;
	}

	private List<Integer> findAllVal(TreeNode root) {
		List<Integer> tree = new ArrayList<>();
		tree.add(root.val);
		if (root.left != null)
			tree.addAll(findAllVal(root.left));
		if (root.right != null)
			tree.addAll(findAllVal(root.right));
		return tree;
	}

}
