/*
 * ��¥: 2021/05/04
 * ����: �ڹ��� ����_����ȭ�� ���-printf()
 * �̸�: ���ϸ�
 */
public class Ex2_005 {

	public static void main(String[] args) {
		System.out.println(10.0/3); //�������� ����� �Ǽ��� ��� ���ؼ� 10.0�� �Է�
		
		System.out.printf("%d%n", 15); //'%d'�� 10����, '%n'�� ����(OS���� ���๮�ڰ� �ٸ� �� �����Ƿ� \n���� %n�� ����) 
		System.out.printf("%#o%n", 15); //'%o' 8����, '#' ���λ�
		System.out.printf("%#x%n", 15); //'%X' 16����
		System.out.printf("%s%n", Integer.toBinaryString(15)); //������ 2������ ��ȯ�ؼ� ���ڿ��� ��ȯ�ϹǷ� '%s'���
		
		float f = 123.456789f;
		System.out.printf("%f%n", f); // float�� ���е��� 7�ڸ�
		
		double d = 123.456789;
		System.out.printf("%f%n", d); // double�� ���е��� 15�ڸ�
		System.out.printf("%e%n", d); //���� �������� ���
		
	}
}
