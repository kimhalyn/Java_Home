/*
 * ��¥: 2021/05/15
 * ����: �ڹ��� ����_���� Ŭ������ �����ڿ� ���ټ�(1)
 * �̸�: ���ϸ�
 */
public class Ex7_027 {

	class InstanceInner{
		int iv = 100;
//		static int cv = 100; ���� -> static���� ���� �Ұ�
		final static int CONST = 100;
	}
	static class StaticInner{
		int iv = 200;
		static int cv = 200; //staticŬ������ static���(��ü �������� ��� ����)���� ����
	}
	void myMethod() {
		class LocalInner{
			int iv = 300;
//			static int cv = 300; ���� -> static���� ���� �Ұ�
			final static int CONST = 300;
		}
			}
	public static void main(String[] args) {
		System.out.println(InstanceInner.CONST);
		System.out.println(StaticInner.cv); 
		
	}
} 
