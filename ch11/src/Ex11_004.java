import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*
 * 날짜: 2021/05/28
 * 내용: 자바의 정석_스택과 큐
 * 이름: 김하린
 * 스택: 밑이 막힌 상자, list in first out(LIFO), 저장(push), 추출(pop)
 * 큐: 양 끝이 뚫린 상자, first in first out(FIFO), 저장(offer), 추출(poll)
 */
public class Ex11_004 {

	public static void main(String[] args) {
		Stack st = new Stack();
		Queue q = new LinkedList();
		
		st.push("0");
		st.push("1");
		st.push("2");
		
		q.offer("0");
		q.offer("1");
		q.offer("2");
		
		System.out.println("= stack =");
		while(!st.empty()) {
			System.out.println(st.pop()); //스택에서 요소 하나 꺼냄
		}
		System.out.println("= queue =");
		while(!q.isEmpty()) {
			System.out.println(q.poll()); //큐에서 요소 하나 꺼냄
		}
	}
}
