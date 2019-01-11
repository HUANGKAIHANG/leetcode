package NaryTreePostorderTraversal;

import java.util.ArrayList;
import java.util.List;

public class NaryTreePostorderTraversal {
    public static void main(String[] args) {
        Node n5 = new Node(5, null);
        Node n6 = new Node(6, null);
        List<Node> n3s = new ArrayList<Node>();
        n3s.add(n5);
        n3s.add(n6);
        Node n3 = new Node(3, n3s);
        Node n2 = new Node(2, null);
        Node n4 = new Node(4, null);
        List<Node> n1s = new ArrayList<Node>();
        n1s.add(n3);
        n1s.add(n2);
        n1s.add(n4);
        Node n1 = new Node(1, n1s);
        Solution solution = new Solution();
        System.out.println(solution.postorder(n1));
    }
}

class Solution {
    List<Integer> postorder(Node root) {
        List<Integer> ans = new ArrayList<>();
        if (root != null) {
            if (root.children == null) {
                ans.add(root.val);
            } else {
                for (int i = 0; i < root.children.size(); i++)
                    ans.addAll(postorder(root.children.get(i)));
                ans.add(root.val);
            }
        }
        return ans;
    }
}