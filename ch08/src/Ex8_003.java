/*
 * ��¥: 2021/05/17
 * ����: �ڹ��� ����_����ó��, try-catch(2)
 * �̸�: ���ϸ�
 */
public class Ex8_003 {

	public static void main(String[] args) {
		System.out.println(1);
		try {
			System.out.println(0/0); //���ܹ߻�, 0���� ���� �� ����
			System.out.println(2);
		}catch(ArithmeticException ae) {
			System.out.println(3);
		}//try-catch ����
		System.out.println(4);
	}
}
