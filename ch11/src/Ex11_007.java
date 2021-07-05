import java.util.ArrayList;
import java.util.Iterator;

/*
 * ��¥: 2021/05/31
 * ����: �ڹ��� ����_Iterator, ListIterator, Enumeration(�� ����)
 * �̸�: ���ϸ�
 * ������ ������� -> �÷��ǿ� ����� �����͸� �о�� �� ����ϴ� �������̽�
 * boolean hasNext(): �о� �� ��Ұ� �����ִ��� Ȯ��
 * Object next(): ���� ��Ҹ� �о� �� 
 * 
 * Iterator: �ܹ��⸸(next) ����
 * ListIterator: �����(next, previous) ����
 * 
 * Map���� iterator()�� ����, keySet(), entrySet(), values()�� ȣ���ؾ� ��
 * -> Iterator it = map.entrySet().iterator();
 */
public class Ex11_007 {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		Iterator it = list.iterator(); //1ȸ������ �ݺ��ϰ� ������, iterator�� �ٽ� ���;� ��
		
		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
		System.out.println();
		it = list.iterator();
		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
	}
}