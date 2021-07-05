import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * ��¥: 2021/05/28
 * ����: �ڹ��� ����_LinkedList
 * �̸�: ���ϸ�
 * <�迭>
 * ����: �迭 ������ ����, �����͸� �дµ� �ɸ��� �ð��� ª��
 * ����: ũ�� ���� �Ұ�, ��������� �������� �߰�/������ �ð��� ���� �ɸ�
 * 
 * LinkedList
 * �ҿ��������� �����ϴ� �����͸� ����
 * ���Ḯ��Ʈ, ������ ���ټ��� ����
 * 
 * <��>
 * ������ ������ �߰�/����: arrayList(�迭���)
 * ������� ������ �߰�/����: linkedList(������)
 * ���ٽð� ����: arrayList
 */
public class Ex11_003 {

	public static void add(List list) {
		for (int i = 0; i < 100000; i++) {
			list.add(i + "");
		}
	}

	public static long access(List list) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			list.get(i);
		}
		long end = System.currentTimeMillis();
		return end - start;
	}

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList(1000000);
		LinkedList ll = new LinkedList();
		add(al);
		add(ll);
		
		System.out.println("= ���ٽð��׽�Ʈ =");
		System.out.println("ArrayList :"+ access(al));
		System.out.println("linkedList :"+ access(ll));
	}
}
