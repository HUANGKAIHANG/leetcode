package NaryTreeLevelOrderTraversal;

import java.util.ArrayList;
import java.util.List;

public class NaryTreeLevelOrderTraversal {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Node n5 = new Node(5, null);
        Node n6 = new Node(6, null);
        List<Node> n3s = new ArrayList<>();
        n3s.add(n5);
        n3s.add(n6);
        Node n3 = new Node(3, n3s);
        Node n2 = new Node(2, null);
        Node n4 = new Node(4, null);
        List<Node> n1s = new ArrayList<>();
        n1s.add(n3);
        n1s.add(n2);
        n1s.add(n4);
        Node n1 = new Node(1, n1s);
        List<List<Integer>> ans = solution.levelOrder(null);
        for (List<Integer> an : ans) {
            for (Integer integer : an)
                System.out.print(integer);
            System.out.println();
        }
    }
}

class Solution {
    List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Node> current = new ArrayList<>();
        if (root!=null)
            current.add(root);
        while (current.size() != 0) {
            List<Integer> temp = new ArrayList<>();
            List<Node> children = new ArrayList<>();
            for (Node node : current) {
                temp.add(node.val);
                if (node.children != null)
                    children.addAll(node.children);
            }
            ans.add(temp);
            current = children;
        }
        return ans;
    }
}
