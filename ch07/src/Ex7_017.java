/*
 * ��¥: 2021/05/14
 * ����: �ڹ��� ����_���������� �ν��Ͻ��� ����
 * �̸�: ���ϸ�
 * ���� Ŭ���� �޼��带 �ڼ� Ŭ�������� �������̵� -> �������̵��� �޼���(=�ڽ� �޼���) ȣ��
 * ������ ��������� ��� �������� Ÿ�Կ� ���� �޶���
 */
class Beverage{
	int x = 100;
	void method() {
		System.out.println("���� �޼���");
	}
}
class Coffee extends Beverage{
	int x = 200;
	void method() {
		System.out.println("�ڽ� �޼���");
		System.out.println("x="+ x);
		System.out.println("super.x="+ super.x);
		System.out.println("this.x="+ this.x);
	}
}
public class Ex7_017 {

	public static void main(String[] args) {
		
		Beverage be = new Coffee();
		Coffee co = new Coffee();
		
		System.out.println("be.x ="+ be.x);
		be.method();
		System.out.println();
		System.out.println("co.x="+ co.x);
		co.method();
	}
} 
