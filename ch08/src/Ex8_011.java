/*
 * ��¥: 2021/05/17
 * ����: �ڹ��� ����_finally��(2)
 * �̸�: ���ϸ�
 * finally�� -> ���� �߻� ���ο� ������� �׻� ����Ǿ�� �ϴ� �ڵ带 ����
 */
public class Ex8_011 {

	public static void main(String[] args) {

		Ex8_011.method1();
		System.out.println("method1()�� ������ ��ġ�� main�޼���� ���ƿԽ��ϴ�");
	}

	static void method1() {
		try {
			System.out.println("method1()�� ȣ��Ǿ����ϴ�");
			return; //���� ���� �޼��� ����
		} catch (Exception e) {
			e.printStackTrace();
			//return�� ����Ǿ -> finally���� ����ǰ� �޼��� ���� �̷����
		} finally {
			System.out.println("method1()�� finally���� ����Ǿ����ϴ�"); 
		}
	}
}