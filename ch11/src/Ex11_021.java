import java.util.*;
import static java.util.Collections.*; //Collections.�� ���������ϰ� ����

/*
 * ��¥: 2021/06/01
 * ����: �ڹ��� ����_collections ���
 * �̸�: ���ϸ�
 */
public class Ex11_021 {

	public static void main(String[] args) {

		List list = new ArrayList();
		System.out.println(list);

		addAll(list, 1, 2, 3, 4, 5);
		System.out.println("addAll="+ list);

		rotate(list, 2); //�� ���� ���ڰ� �� ������ �̵�(�̸� 2�� ����)
		System.out.println("rotate="+list);

		swap(list, 0, 2); //�ε��� ��ȣ���� ��ȯ
		System.out.println("swap="+list);

		shuffle(list);
		System.out.println("shuffle="+list);

		sort(list);
		System.out.println("sort="+list);

		sort(list, reverseOrder());
		System.out.println("sort reverseOrder="+list);
		
		int idx = binarySearch(list, 3); //���� 3�� ��� ����Ǿ� �ִ��� -> �ε��� ��ȣ ���
		System.out.println("index of 3 = " + idx);

		System.out.println("max=" + max(list));
		System.out.println("min=" + min(list));
		System.out.println("min=" + max(list, reverseOrder()));

		fill(list, 9);
		System.out.println("list=" + list);

		List newList = nCopies(list.size(), 2);
		System.out.println("newList=" + newList);

		System.out.println(disjoint(list, newList)); //disjoint: list�� newList�� �����Ұ� ������ -> true ��ȯ

		copy(list, newList); //newList���� list�� ����
		System.out.println("newList=" + newList);
		System.out.println("list=" + list);

		replaceAll(list, 2, 1); //2�� 1�� �ٲ��
		System.out.println("list=" + list);

		Enumeration e = enumeration(list); 
		ArrayList list2 = list(e);

		System.out.println("list2=" + list2);
	}
}