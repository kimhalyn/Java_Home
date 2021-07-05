/*
 * ��¥: 2021/05/15
 * ����: �ڹ��� ����_���� Ŭ������ �����ڿ� ���ټ�(4)
 * �̸�: ���ϸ�
 */
class Outer{
	class instanceInner{
		int iv = 100;
	}
	static class staticInner{
		int iv = 200;
		static int cv = 300;
	}
	void myMethod() {
		class localInner{
			int iv = 400;
		}
	}
}
public class Ex7_030 {
	public static void main(String[] args) {
		
//		�ܺ� Ŭ���� ���� -> �ν��Ͻ�Ŭ������ �ν��Ͻ� ����
		Outer oc = new Outer();
		Outer.instanceInner ii = oc.new instanceInner();
		System.out.println("ii.iv : "+ ii.iv);
		
		//�ܺ� Ŭ������ ��ü ���� ���� ��� ����
		System.out.println("Outer.staticInner.cv : "+ Outer.staticInner.cv);
		
		//static ���� Ŭ���� �ν��Ͻ��� �ܺ� Ŭ������ ���� �������� �ʾƵ� ��
		Outer.staticInner si = new Outer.staticInner();
		System.out.println("si.iv : "+ si.iv);
	}
}
