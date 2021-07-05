import java.util.*;

/*
 * ��¥: 2021/05/31
 * ����: �ڹ��� ����_HashSet(1)
 * �̸�: ���ϸ�
 * ����, �ߺ� x
 * HashSet: Set�������̽��� ������ ��ǥ���� �÷��� Ŭ����
 * ������ �����ϰ� �ʹٸ� -> LinkedHashSetŬ���� ���
 * TreeSet: ���� �˻��� ���Ŀ� ����, HashSet���� ������ �߰�/������ �ð� �� �ɸ�
 * 
 * containsAll: �κ�����
 * addAll: ������
 * retainAll: ������
 * removeAll: ������
 */
public class Ex11_010 {

	public static void main(String[] args) {

		Object[] objArr = {"1", new Integer(1), "2", "3", "3", "4", "4", "4"};
		Set set = new HashSet();
		
		for(int i=0; i<objArr.length; i++) {
			set.add(objArr[i]);
		}
		System.out.println(set);
		
		Iterator it = set.iterator();
		
		while(it.hasNext()) { //�о�� ��Ұ� �ִ��� Ȯ��
			System.out.println(it.next()); //��� �ϳ��� ��������
		}
	}
}

