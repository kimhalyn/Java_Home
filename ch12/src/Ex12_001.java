import java.util.ArrayList;

/*
 * ��¥: 2021/06/01
 * ����: �ڹ��� ����_���׸���
 * �̸�: ���ϸ�
 * �����Ͻ� Ÿ���� üũ���ִ� ���
 * ��ü�� Ÿ�� �������� ����(����ȯ ���ص� �� -> �ڵ� ����ȭ)
 */
public class Ex12_001 {
	
	public static void main(String[] args) {
//		2. ���࿡�� -> ó������ Integer�� �����ϰ� Ÿ������ ����, �پ��� Ÿ�� ����Ϸ��� -> Object����
		ArrayList<Integer> list = new ArrayList<Integer>(); 
		list.add(10); //list.add(new Integer(10));
		list.add(20);
//		list.add("30"); //String �߰� -> 3. Ÿ������ ����ġ�� ���� 
		list.add(30);
		
//		Integer i = (Integer)list.get(2); //1. ������ ok, ����� �����߻�(java.lang.ClassCastException)
		Integer i = list.get(2); //Ÿ�������� �˰��־ -> (Integer)���� ����
		System.out.println(list);
	}
}
