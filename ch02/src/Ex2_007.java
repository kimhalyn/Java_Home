/*
 * ��¥: 2021/05/04
 * ����: �ڹ��� ����_����ȭ�� ���-printf()_�Ǽ��� ���
 * �̸�: ���ϸ�
 */
public class Ex2_007 {

	
	public static void main(String[] args) {
		
		String url = "www.codechobo.com";
		
		float f1 = .10f;
		float f2 = 1e1f;
		float f3 = 3.14e3f;
		double d = 1.23456789;
		
		System.out.printf("f1=%f, %e, %g%n", f1, f1, f1); //'%f' �Ϲ������� ���, '%e' �������·� ���, '%g' ���� ������ ǥ��
		System.out.printf("f2=%f, %e, %g%n", f2, f2, f2);
		System.out.printf("f3=%f, %e, %g%n", f3, f3, f3);
		
		System.out.printf("d=%f%n", d); //f�� �Ҽ��� �Ʒ� 6�ڸ� ���, 7�ڸ����� �ݿø�
		System.out.printf("d=%14.10f%n", d); //��ü 14�ڸ� �� �Ҽ��� 10��
		
		System.out.printf("[12345678901234567890]%n");
		System.out.printf("[%s]%n", url); //'%s' ���ڿ�
		System.out.printf("[%20s]%n", url); //��ü 20�ڸ�, ���� ����
		System.out.printf("[%-20s]%n", url); //��ü 20�ڸ�, ���� ����
		System.out.printf("[%.8s]%n", url); //���ʿ��� 8���ڸ� ���
	}
}
