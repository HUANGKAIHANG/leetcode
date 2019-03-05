package ReverseLinkedList;

import java.util.ArrayList;
import java.util.List;

public class ReverseLinkedList {
	public static void main(String[] args) {
		Solution solution = new Solution();
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(3);
		ListNode l4 = new ListNode(4);
		ListNode l5 = new ListNode(5);
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l5;
		ReverseLinkedList.printLinkedList(solution.reverseList(l1));
	}

	private static void printLinkedList(ListNode listNode) {
		System.out.print(listNode.val + ",");
		if (listNode.next != null)
			printLinkedList(listNode.next);
	}
}

class Solution {
	ListNode reverseList(ListNode head) {
		if (head==null)
			return null;
		int total = 0;
		ListNode current = head;
		List<ListNode> list = new ArrayList<>();

		while (current != null) {
			total++;
			list.add(current);
			current = current.next;
		}

		for (int i = total - 1; i > 0; i--)
			list.get(i).next = list.get(i - 1);
		list.get(0).next = null;
		return list.get(total - 1);
	}
}


