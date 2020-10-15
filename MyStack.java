package homework;

public class MyStack {

	public class Node {
		int value;
		Node next;
	}

	public Node top;

	MyStack() {
		this.top = null;
	}

	public void push(int value) {

		Node curr = new Node();
		curr.value = value;
		curr.next = top;
		top = curr;

	}

	public void pop() {

		if (top == null) {
			return;
		}
		top = top.next;

	}

	public void print() {
		Node curr = top;
		while (curr != null) {
			System.out.println(curr.value);
			curr = curr.next;
		}
	}

}
