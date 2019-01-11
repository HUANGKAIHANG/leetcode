package NaryTreePostorderTraversal;

import java.util.List;

public class Node {
    public int val;
    List<Node> children;

    public Node() {
    }

    Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
