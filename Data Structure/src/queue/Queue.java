package queue;

public class Queue {

	ListNode rear;
	ListNode front;
	int length;

	private class ListNode {

		private int data;
		private ListNode next;

		public ListNode(int data) {
			this.data = data;
		}

	}

	public int length() {
		return length;
	}

	public boolean isEmpty() {
		return length == 0;
	}

	public void enqueue(int data) {

		ListNode r = new ListNode(data);
		if (isEmpty()) {
			front = r;
		} else {
			rear.next = r;

		}
		rear = r;
		length++;

	}

	public static void main(String[] args) {

		Queue w = new Queue();
		w.enqueue(45);
		w.enqueue(78);
		w.enqueue(44);
		w.enqueue(80);

		System.out.println(w.length);
		int d = 0;
		while (w.length > d) {
			System.out.println(w.front.data);
			w.front = w.front.next;
			d++;
			

		}

	}

}
