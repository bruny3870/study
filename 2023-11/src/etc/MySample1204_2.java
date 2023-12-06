package etc;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class MySample1204_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Stack & Queue
		Stack s = new Stack();
		Queue q = new LinkedList();		//Queue �������̽��� ����ü�� LinkedList ���
		
		s.push("0");	//Stack ����
		s.push("1");
		s.push("2");
		
		q.offer("3");	//Queue ����
		q.offer("4");
		q.offer("5");
		
		System.out.println("Stack()========");
		while (!s.empty()) {
			System.out.println(s.pop());	//Stack ��ȯ
		}
		
		System.out.println("Queue()========");
		while (!q.isEmpty()) {
			System.out.println(q.poll());	//Queue ��ȯ
		}
	}

}
