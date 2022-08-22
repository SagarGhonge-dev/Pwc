package stack;

public class Stack {

	private ListNode top;
	private static int length;

	public void push(int data) {

		ListNode s = new ListNode(data);
		s.next = top;
		top = s;
		length++;

	}

	public int pop() {

		int result = top.data;
		top = top.next;
		length--;
		return result;

	}

	public static void main(String[] args) {
		Stack t = new Stack();
		t.push(45);
		t.push(90);
		t.push(35);
		t.push(100);

		while (length > 0) {

			System.out.println(t.pop());
		}
	}

}
