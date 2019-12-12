package linkedlist;

import java.io.IOException;

public class LinkedList {

	static class SinglyLinkedListNode {
		public int data;
		public SinglyLinkedListNode next;

		public SinglyLinkedListNode(int nodeData) {
			this.data = nodeData;
			this.next = null;
		}
	}

	static class SinglyLinkedList {
		public SinglyLinkedListNode head;
		public SinglyLinkedListNode tail;

		public SinglyLinkedList() {
			this.head = null;
			this.tail = null;
		}

		public void insertNode(int nodeData) {
			SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

			if (this.head == null) {
				this.head = node;
			} else {
				this.tail.next = node;
			}

			this.tail = node;
		}
	}

	public static void printSinglyLinkedList(SinglyLinkedListNode node) {
		System.out.println("printSinglyLinkedList");
		while (node != null) {
			System.out.print((node.data) + " ");
			node = node.next;
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
		System.out.println("");
	}

	private static SinglyLinkedListNode merge(SinglyLinkedListNode headA, SinglyLinkedListNode headB) {

		if (headA == null && headB == null) {
			return null;
		}

		if (headA == null) {
			return headB;
		}

		if (headB == null) {
			return headA;
		}

		if (headA.data <= headB.data) {
			headA.next = merge(headA.next, headB);
			System.out.println("merge ret value 1 : " + headA.next.data);
		} else {
			SinglyLinkedListNode temp = headB;
			headB = headB.next;
			temp.next = headA;
			headA = temp;
			headA.next = merge(headA.next, headB);
			System.out.println("merge ret value 2 : " + headA.next.data);
		}
		System.err.println("return head A : " + headA.data);
		return headA;
	}

	private static SinglyLinkedListNode mergeLists(SinglyLinkedListNode headA, SinglyLinkedListNode headB) {
		System.out.println("headA : " + headA + " headB : " + headB);
		if (headA == null && headB == null)
			return null;
		else if (headA == null)
			return headB;
		else if (headB == null)
			return headA;

		if (headA.data <= headB.data)
			headA.next = mergeLists(headA.next, headB);
		else {
			SinglyLinkedListNode temp = headB;
			headB = headB.next;
			System.err.println("headA: " + headA);
			temp.next = headA;
			headA = temp;
			headA.next = mergeLists(headA.next, headB);
		}
		System.err.println("before return: " + headA + " headb: " + headB);
		return headA;
	}

//	private static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
//		if(head1 == null && head2 == null) {
//            return head1;
//        }
//
//        if(head1 == null && head2 != null) {
//            return head1.next = head2;
//        }
//
//        if(head2 == null && head1 != null) {
//            return head1.next;
//        }
//
//        if(head1.data > head2.data) {
//            head1.next = head2.next;
//            head2.next = head1;
//            return mergeLists(head1, head2);
//        } else {
//            head1.next = 
//            head2.next = head1;
//            return mergeLists(head1, head2);
//        }
//	}

	// Complete the insertNodeAtPosition function below.

	/*
	 * For your reference:
	 *
	 * SinglyLinkedListNode { int data; SinglyLinkedListNode next; }
	 *
	 */
	static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
		int counter = 0;
		SinglyLinkedListNode node = new SinglyLinkedListNode(data);
		if (position == 0) {
			return node;
		}
		SinglyLinkedListNode temp = head;
		while (counter < (position - 1)) {
			temp = temp.next;
			counter++;
		}
		if (temp.next != null) {
			node.next = temp.next;
		}
		temp.next = node;
		return head;
	}

	static SinglyLinkedListNode reverseLinkedList(SinglyLinkedListNode head) {

		SinglyLinkedListNode current = head;
		SinglyLinkedListNode next = null;
		SinglyLinkedListNode previous = null;

		while (current != null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		head = previous;
		return head;
	}

	private static int length(SinglyLinkedListNode head) {
		if (head == null) {
			return 0;
		}
		if (head.next == null) {
			return 1;
		}
		int count = 1;
		while (head.next != null) {
			head = head.next;
			count++;
		}
		return count;
	}

	public static SinglyLinkedListNode rotateRight(SinglyLinkedListNode head, int k) {
		if (head == null) {
			return null;
		}
		if (head.next == null) {
			return head;
		}

		int len = length(head);
		System.out.println(len);
		SinglyLinkedListNode prev = null;
		printSinglyLinkedList(head);
		SinglyLinkedListNode temp = head;
		makeListCircular(head);
		int count = 1;
		while (count < k) {
			temp = temp.next;
			count++;
		}
//		System.out.println("temp.next : "+temp.next);
		head = temp.next;
//		System.out.println("head: "+head.data);
		temp.next = null;
		printSinglyLinkedList(head);
		return head;
	}

	private static int makeListCircular(SinglyLinkedListNode head) {
		if (head == null || head.next == null) {
			return 0;
		}
		SinglyLinkedListNode temp = head;
		int count = 0;
		while (temp.next != null) {
			temp = temp.next;
			count++;
		}
		temp.next = head;
		return count;
	}

	public static SinglyLinkedListNode reverse(SinglyLinkedListNode head) {
		SinglyLinkedListNode curr = head;
		SinglyLinkedListNode next = null;
		SinglyLinkedListNode prev = null;
		while (curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return prev;
	}

	public static void main(String[] args) throws IOException {

		SinglyLinkedListNode head = new SinglyLinkedListNode(1);
		SinglyLinkedListNode node2 = new SinglyLinkedListNode(2);
		SinglyLinkedListNode node3 = new SinglyLinkedListNode(3);
		SinglyLinkedListNode node4 = new SinglyLinkedListNode(4);

		head.next = node2;
		node2.next = node3;
		node3.next = node4;

		SinglyLinkedListNode head5 = new SinglyLinkedListNode(2);
		SinglyLinkedListNode node6 = new SinglyLinkedListNode(3);
		SinglyLinkedListNode node7 = new SinglyLinkedListNode(8);

		head5.next = node6;
		node6.next = node7;

		SinglyLinkedList ll = new SinglyLinkedList();
		ll.head = head;

//		insertNodeAtPosition(head, 4, 2);
//		printSinglyLinkedList(head);
//		printSinglyLinkedList(head5);
//		merge(head, head5);
//		printSinglyLinkedList(head);
//		head = reverseLinkedList(head);
//		printSinglyLinkedList(head);
		rotateRight(head, 1);
	}
}