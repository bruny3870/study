package etc;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class MySample1204_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Stack & Queue
		Stack s = new Stack();
		Queue q = new LinkedList();		//Queue 인터페이스의 구현체인 LinkedList 사용
		
		s.push("0");	//Stack 삽입
		s.push("1");
		s.push("2");
		
		q.offer("3");	//Queue 삽입
		q.offer("4");
		q.offer("5");
		
		System.out.println("Stack()========");
		while (!s.empty()) {
			System.out.println(s.pop());	//Stack 반환
		}
		
		System.out.println("Queue()========");
		while (!q.isEmpty()) {
			System.out.println(q.poll());	//Queue 반환
		}
	}

}
