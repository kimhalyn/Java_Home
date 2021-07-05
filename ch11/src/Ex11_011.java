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
public class Ex11_011 {

	public static void main(String[] args) {

		Set set = new HashSet();
		
		for(int i=0; set.size()<6; i++) {
			int num = (int)(Math.random()*45)+1; //1~45������ ������ ����
			set.add(new Integer(num));
		}
//		set�� ������ �Ұ� -> set�� list�� �ű� ��, list�� ����
		List list = new LinkedList(set);
		Collections.sort(list);
		System.out.println(list);
	}
}

