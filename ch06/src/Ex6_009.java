/*
 * ��¥: 2021/05/10
 * ����: �ڹ��� ����_return��, ��ȯ��
 * �̸�: ���ϸ�
 * return��: ���� ���� �޼��带 �����ϰ� ȣ��� ������ �ǵ��ư�
 * ��ȯ Ÿ���� void -> return ���� ����, �׷��� �ʴٸ� �޼��� �ȿ� �ݵ�� return�� �ʿ�
 * �޼��� �Է�(�Ű�����)�� ���� �� ����, ������ ���(��ȯ��)�� �ݵ�� �ִ� �� ��
 * 
 * �޼��� Ÿ�԰� ��ȯ���� Ÿ���� �ݵ�� ��ġ�ؾ� ��
 * */
class Math {
	void printGugudan(int dan) {
		if (!(2 <= dan && dan <= 9)) {
			return; // dan�� ���ǹ��� �ش��ϸ�, �޼��� �����ϰ� ���ư�
		}
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %2d%n", dan, i, dan * i);
		}
	}

	long max(long a, long b) {
		if (a > b) {
			return a; // ���ǽ��� ���϶��� ����
		} else {
			return b; // ���ǽ��� �����϶��� ����
		}
	}
}

public class Ex6_009 {
	public static void main(String[] args) {

		Math mm = new Math(); // ��ü ����
		// �޼��� ȣ��
		mm.printGugudan(3);
		long result = mm.max(2, 0);
		
		System.out.println();
		
		System.out.println(result);

	}
}
