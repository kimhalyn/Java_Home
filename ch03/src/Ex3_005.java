/*
 * ��¥: 2021/05/05
 * ����: �ڹ��� ����_��Ģ ������
 * �̸�: ���ϸ�
 * 
 * ��� ��ȯ: ���� ���� �ǿ����� Ÿ���� ��ġ��Ű�� ��
 * long + int = int
 * float + int = float
 * double + float = double
 * 
 * int���� ���� Ÿ��(byte, char, short) -> int�� ��ȯ
 * */
public class Ex3_005 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 4;
		
		System.out.printf("%d + %d = %d%n", a, b, a + b);
		System.out.printf("%d - %d = %d%n", a, b, a - b);
		System.out.printf("%d * %d = %d%n", a, b, a * b);
		System.out.printf("%d / %d = %d%n", a, b, a / b); //���� Ÿ�����θ� ��� ���� -> 2.5�� �������� 2 ��ȯ
		System.out.printf("%d / %f = %f%n", a, (float)b, a / (float)b); //���ս��� ���� ������ ����ȯ
		
		
	}
	
}
