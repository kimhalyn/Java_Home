import java.util.*;
/*
 * ��¥: 2021/06/01
 * ����: �ڹ��� ����_HashMap(2)
 * �̸�: ���ϸ�
 * ���� x, �ߺ�(Űx, ��0) (��)���̵�� ��й�ȣ
 * Map�������̽� ����, �����͸� Ű�� ���� ������ ����
 * ���� ������ �����Ϸ���, LinkedHashMapŬ������ ����ϸ� ��
 * �ؽ�(�Լ��� �̿��Ͽ� �����͸� ����/�о��)������� �����͸� ���� -> �˻��� ���� (��)��ȣ�� ĳ���
 * 
 * TreeMap -> ���� �˻��� ���Ŀ� ������ �÷��� Ŭ����
 * HashMap���� ������ �߰�/������ �ð��� �� �ɸ�
 */
public class Ex11_018 {

	public static void main(String[] args) {

		HashMap map = new HashMap();
		map.put("���ڹ�", new Integer(90));
		map.put("���ڹ�", new Integer(100));
		map.put("���ڹ�", new Integer(100));
		map.put("���ڹ�", new Integer(80));
		map.put("���ڹ�", new Integer(90));
		
		Set set = map.entrySet();
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			System.out.println("�̸�: "+ e.getKey() +", ����: "+e.getValue());
		}
		set = map.keySet();
		System.out.println("������ ���: "+ set);
		
		Collection values = map.values();
		it = values.iterator();
		
		int total = 0;
		
		while(it.hasNext()) {
			Integer i = (Integer)it.next();
			total = i.intValue();
		}
		System.out.println("����: "+ total);
		System.out.println("���: "+ (float)total/set.size());
		System.out.println("�ְ�����: "+ Collections.max(values));
		System.out.println("��������: "+ Collections.min(values));
	}
}