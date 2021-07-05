import java.util.HashMap;
import java.util.Scanner;

/*
 * ��¥: 2021/05/31
 * ����: �ڹ��� ����_HashMap(1)
 * �̸�: ���ϸ�
 * ���� x, �ߺ�(Űx, ��0) (��)���̵�� ��й�ȣ
 * Map�������̽� ����, �����͸� Ű�� ���� ������ ����
 * ���� ������ �����Ϸ���, LinkedHashMapŬ������ ����ϸ� ��
 * �ؽ�(�Լ��� �̿��Ͽ� �����͸� ����/�о��)������� �����͸� ���� -> �˻��� ���� (��)��ȣ�� ĳ���
 * 
 * TreeMap -> ���� �˻��� ���Ŀ� ������ �÷��� Ŭ����
 * HashMap���� ������ �߰�/������ �ð��� �� �ɸ�
 */
public class Ex11_017 {

	public static void main(String[] args) {

		HashMap map = new HashMap();
		map.put("myId", "1234");
		map.put("asdf", "1111");
		map.put("asdf", "1234"); // key���� ��ġ�ϸ� -> value���� ����

		Scanner s = new Scanner(System.in);

		while (true) { //���� �ݺ���
			System.out.println("Id�� password�� �Է����ּ���");
			System.out.println("Id :");
			String id = s.nextLine().trim();

			System.out.println("password :");
			String password = s.nextLine().trim();
			System.out.println();

			if (!map.containsKey(id)) { // containskey(id) -> �Է��� id�� �����ϴ��� Ȯ��
				System.out.println("�Է��Ͻ� id�� �������� �ʽ��ϴ�. �ٽ� �Է����ּ���.");
				continue;
			} else {
				if (!(map.get(id).equals(password))) { //map.get(id) -> value�� ��ȯ
					System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�. �ٽ� �Է����ּ���.");
				} else {
					System.out.println("id�� ��й�ȣ�� ��ġ�մϴ�.");
					break;
				}
			}
		}
	}
}