/*
 * ��¥: 2021/05/17
 * ����: �ڹ��� ����_printStackTrace()�� getMessage()
 * �̸�: ���ϸ�
 * printStackTrace(): ȣ�⽺�ÿ� �ִ� ������ ȭ�鿡 ���
 * getMessage(): ����Ŭ���� �ν��Ͻ��� ����� �޽���
 */
public class Ex8_005 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0); //���ܹ߻�, 0���� ���� �� ����
			System.out.println(4);
		}catch(ArithmeticException ae) {
			ae.printStackTrace();
			System.out.println("���� �޽���: "+ae.getMessage() );
		}//try-catch ����
		System.out.println(6);
	}
}