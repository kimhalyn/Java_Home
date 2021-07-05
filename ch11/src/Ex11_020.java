import java.util.*;

/*
 * ��¥: 2021/06/01
 * ����: �ڹ��� ����_HashMap(4)
 * �̸�: ���ϸ�
 * ���� x, �ߺ�(Űx, ��0) (��)���̵�� ��й�ȣ
 * Map�������̽� ����, �����͸� Ű�� ���� ������ ����
 * ���� ������ �����Ϸ���, LinkedHashMapŬ������ ����ϸ� ��
 * �ؽ�(�Լ��� �̿��Ͽ� �����͸� ����/�о��)������� �����͸� ���� -> �˻��� ���� (��)��ȣ�� ĳ���
 * 
 * TreeMap -> ���� �˻��� ���Ŀ� ������ �÷��� Ŭ����
 * HashMap���� ������ �߰�/������ �ð��� �� �ɸ�
 */
public class Ex11_020 {

	public static void main(String[] args) {
		String[] data = { "A", "K", "A", "K", "D", "K", "A", "K", "K", "K", "Z", "D" };

		HashMap map = new HashMap();

		for (int i = 0; i < data.length; i++) {
			if (map.containsKey(data[i])) {
				int value = (int) map.get(data[i]);
				map.put(data[i], value+1);
			} else {
				map.put(data[i], 1);
			}
		}
		Iterator it = map.entrySet().iterator();

		while (it.hasNext()) {
			Map.Entry entry = (Map.Entry) it.next();
			int value = (int) entry.getValue();
			System.out.println(entry.getKey() + " : " + printBar('#', value) + " " + value);
		}
	}

	public static String printBar(char ch, int value) {
		char[] bar = new char[value];

		for (int i = 0; i < bar.length; i++) {
			bar[i] = ch;
		}
		return new String(bar);
	}

}