package linklist;

import java.util.HashMap;
import java.util.LinkedList;

public class Demo {

	Node head;
	Node tail;

	public void add(int data) {
		Node n = new Node(data);
		if (head == null) {
			head = n;
			tail = n;

		} else {
			tail.next = n;
			tail = n;  

		}
	}

	public void dispay() {
		Node currnt = head;
		if (head == null) {
			System.out.println("empty");
		}
		while (currnt != null) {
			System.out.println(currnt.data);
			currnt = currnt.next;
		}
	}

	public static void main(String[] args) {

		Demo d = new Demo();
		LinkedList<Integer> s=new LinkedList<Integer>();
	
	//	HashMap<Integer,String> w=new HashMap<Integer, String>();
		
		
		s.add(4);
		s.add(7);
		s.add(11);
		s.add(1, 100);
		
		//s.forEach(t -> System.out.println(t));

		d.add(4);
		d.add(7);
		d.add(4);
		d.add(17);
		
		d.dispay();
		
		
		
		
		
		
		
		
		
		
		


	}
}
