/*
 * ��¥: 2021/05/04 
 * ����: �ڹ��� ����_�Ǽ������� ����ȯ(Casting)
 * �̸�: ���ϸ�
 * */
public class Ex2_013 {

	public static void main(String[] args) {

		float f = 9.1234567f;
		double d  = 9.1234567;
		double d2 = (double)f; //float f�� double�� ����ȯ
		
		System.out.printf("f = %20.18f%n", f);
		System.out.printf("d = %20.18f%n", d);
		System.out.printf("d2 = %20.18f%n", d2);
	}
	
}
