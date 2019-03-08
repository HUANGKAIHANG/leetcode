package DeleteNodeLinkedList;

import java.util.ArrayList;
import java.util.List;

public class DeleteNodeLinkedList {
	private static ListNode l1 = new ListNode(4);
	private static ListNode l2 = new ListNode(5);
	private static ListNode l3 = new ListNode(1);
	private static ListNode l4 = new ListNode(9);
	private static List<ListNode> head = new ArrayList<>();

	public static void main(String[] args) {
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		head.add(l1);
		head.add(l2);
		head.add(l3);
		head.add(l4);
		deleteNode(l1);
	}

	private static void deleteNode(ListNode node) {
		node.val = node.next.val;
		node.next = node.next.next;
	}

}


