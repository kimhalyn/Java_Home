import java.util.*;

/*
 * ��¥: 2021/05/31
 * ����: �ڹ��� ����_comparator�� comparable
 * �̸�: ���ϸ�
 * <��ü ���Ŀ� �ʿ��� �޼���>
 * comparable: �⺻ ���ı���(default: ���ı����� ���� �� ���)
 * comparator: �⺻ ���ı��� �� ����
 * 0: ����, ���: ������ ŭ, ����: �������� ŭ
 * compareTo: �־��� ��ü�� �ڽ�(this)�� ��
 */
public class Ex11_009 {

	public static void main(String[] args) {

		String[] strArr = { "cat", "Dog", "lion", "tiger" };

		Arrays.sort(strArr); // �빮�ڰ� �ҹ��ں��� �տ� ��ġ��
		System.out.println("strArr=" + Arrays.toString(strArr));

		Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER); // ��ҹ��� ���� ����
		System.out.println("strArr=" + Arrays.toString(strArr));

		Arrays.sort(strArr, new Descending()); //�������� ����
		System.out.println("strArr=" + Arrays.toString(strArr));
	}
}

class Descending implements Comparator {
	public int compare(Object o1, Object o2) {
		if (o1 instanceof Comparable && o2 instanceof Comparable) {
			Comparable c1 = (Comparable) o1;
			Comparable c2 = (Comparable) o2;
			return c1.compareTo(c2) * -1; // (*-1) -> �⺻ ���Ĺ�� ������ ����
		}
		return -1;
	}
}
