package MiddleLinkedList;

import java.util.ArrayList;
import java.util.List;

public class MiddleLinkedList {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode ln1 = new ListNode(1);
        ListNode ln2 = new ListNode(2);
        ListNode ln3 = new ListNode(3);
        ListNode ln4 = new ListNode(4);
        ListNode ln5 = new ListNode(5);
//        ListNode ln6 = new ListNode(6);
        ln1.next = ln2;
        ln2.next = ln3;
        ln3.next = ln4;
        ln4.next = ln5;
        ln5.next = null;
//        ln6.next = null;
        ListNode mid = solution.middleNode(ln1);
        while (true) {
            System.out.print(mid.val + ",");
            if (mid.next == null)
                break;
            mid = mid.next;
        }
    }
}

class Solution {
    ListNode middleNode(ListNode head) {
        List<ListNode> l = new ArrayList<>();
        while (true) {
            l.add(head);
            if (head.next == null)
                break;
            head = head.next;
        }
        return l.get(l.size() / 2);
    }
}