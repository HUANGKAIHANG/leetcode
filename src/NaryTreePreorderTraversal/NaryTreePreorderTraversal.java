package NaryTreePreorderTraversal;

import java.util.ArrayList;
import java.util.List;

public class NaryTreePreorderTraversal {
    public static void main(String[] args) {
        Node n6 = new Node(6, null);
        Node n5 = new Node(5, null);
        List<Node> n3s = new ArrayList<>();
        n3s.add(n5);
        n3s.add(n6);
        Node n4 = new Node(4, null);
        Node n2 = new Node(2, null);
        Node n3 = new Node(3, n3s);
        List<Node> n1s = new ArrayList<>();
        n1s.add(n3);
        n1s.add(n2);
        n1s.add(n4);
        Node n1 = new Node(1, n1s);
        Solution solution = new Solution();
        System.out.println(solution.preorder(n1));
    }
}

class Solution {
    List<Integer> preorder(Node root) {
        List<Integer> ans = new ArrayList<>();
        if (root != null) {
            ans.add(root.val);
            if (root.children != null) {
                for (int i = 0; i < root.children.size(); i++) {
                    ans.addAll(preorder(root.children.get(i)));
                }
            }
        }
        return ans;
    }
}
