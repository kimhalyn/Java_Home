/*
 * ��¥: 2021/05/13
 * ����: �ڹ��� ����_�������� super
 * �̸�: ���ϸ�
 * ��ü �ڽ��� ����Ű�� ��������, �ν��Ͻ� �޼���(������)������ ����, �������� �ڽ��� ����
 * cf)this �������� -> iv�� lv�� ������ ���
 */
class Parent{
	int x = 10; 
}
class Child extends Parent{
	int x =20;
	void method() {
		System.out.println("x="+ x); //����� �� ����
		System.out.println("this.x="+ this.x);
		System.out.println("super.x="+ super.x);
	}
}
public class Ex7_005 {

	public static void main(String[] args) {
		Child c = new Child();
		c.method();
	}
}
