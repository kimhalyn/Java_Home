/*
 * ��¥: 2021/05/15
 * ����: �ڹ��� ����_�������̽��� ����(1)
 * �̸�: ���ϸ�
 * �� ���(��ü) ���� ����, ��ȭ, ������ ���� '�߰� ����'�� ��(ex)���Ǳ�
 * ����� ������ �и���ų �� ����, ������ ����(���濡 ����, ������ �ڵ�)
 */
class A{
	public void method(I i) {//�������̽� I�� ������ �͵鸸 ����
		i.method();
	}
}
//BŬ������ ����� ������ �и�
interface I{
	public void method();
}
class B implements I{
	public void method() {
		System.out.println("BŬ������ �޼���");
	}
}
class C implements I{
	public void method() {
		System.out.println("CŬ������ �޼���");
	}
}
public class Ex7_024 {

	public static void main(String[] args) {
		
		A a = new A();
		a.method(new B() ); //A�� B�� ���(����), C
		a.method(new C());
	}
} 
