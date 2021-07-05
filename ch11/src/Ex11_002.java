import java.util.ArrayList;
import java.util.Collections;

/*
 * ��¥: 2021/05/28
 * ����: �ڹ��� ����_ArrayList
 * �̸�: ���ϸ�
 */
public class Ex11_002 {

	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1:"+ list1);
		System.out.println("list2:"+ list2);
		System.out.println();
	}
	
	public static void main(String[] args) {
		
//		�⺻ ���̰� 10�� ArrayList�� ����
		ArrayList list1 = new ArrayList(10);
		
//		add -> �� �߰�
		list1.add(new Integer(5)); //list1.add(5)�� ���� -> autoboxing�� ���� �⺻���� ���������� �ڵ� ��ȯ
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));
		
		ArrayList list2 = new ArrayList(list1.subList(1, 4));
		print(list1, list2);
		
//		sort -> �������� ����
		Collections.sort(list1);
		Collections.sort(list2);
		print(list1, list2);
		
//		containsAll -> list1�� list2�� ��� ��Ҹ� �����ϰ� �ִ°�
		System.out.println("list1.containsAll(list2):"+ list1.containsAll(list2));
		
		list2.add("B");
		list2.add("C");
		list2.add(3, "A");
		print(list1, list2);
		
//		set -> �� ����
		list2.set(3, "AA");
		print(list1, list2);
		
		list1.add(0, "1");
//		indexOf(i)�� i�� ����� ��ġ(�ε���)�� �˷���
		System.out.println("index= "+ list1.indexOf("1"));
		print(list1, list2);
		
//		retainsAll -> list1���� list2�� ��ġ�� �κи� ����� ����
		System.out.println("list1.retainAll(list2): "+ list1.retainAll(list2));
		print(list1, list2);
		
		for(int i=list2.size()-1; i>=0; i--) {
			if(list1.contains(list2.get(i))) //list1�� �ִ� ������ �Ǵ�
				list2.remove(i);
		}
		print(list1, list2);
	}
}
