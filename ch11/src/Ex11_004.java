import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*
 * ��¥: 2021/05/28
 * ����: �ڹ��� ����_���ð� ť
 * �̸�: ���ϸ�
 * ����: ���� ���� ����, list in first out(LIFO), ����(push), ����(pop)
 * ť: �� ���� �ո� ����, first in first out(FIFO), ����(offer), ����(poll)
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
			System.out.println(st.pop()); //���ÿ��� ��� �ϳ� ����
		}
		System.out.println("= queue =");
		while(!q.isEmpty()) {
			System.out.println(q.poll()); //ť���� ��� �ϳ� ����
		}
	}
}
