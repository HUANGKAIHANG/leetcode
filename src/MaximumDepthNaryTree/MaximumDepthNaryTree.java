package MaximumDepthNaryTree;

import java.util.ArrayList;
import java.util.List;

public class MaximumDepthNaryTree {
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
        System.out.println(solution.maxDepth(n1));
    }
}

class Solution {
    int maxDepth(Node root) {
        int depth = 0;
        int max = 0;
        if (root != null) {
            depth++;
            if (root.children != null) {
                for (Node n : root.children)
                    max = Math.max(max, maxDepth(n));
                depth = depth + max;
            }
        }
        return depth;
    }
}
