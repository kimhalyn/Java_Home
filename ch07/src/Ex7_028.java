/*
 * ��¥: 2021/05/15
 * ����: �ڹ��� ����_���� Ŭ������ �����ڿ� ���ټ�(2)
 * �̸�: ���ϸ�
 */
class Ex7_028 {

	class InstanceInner{}
	static class StaticInner{}

	InstanceInner iv = new InstanceInner();
	static StaticInner cv = new StaticInner();
	
	static void stiaticMethod() {
//		InstanceInner obj1 = new InstanceInner(); ���� -> static����� �ν��Ͻ������ ���� ������ �� ����
		StaticInner obj2 = new StaticInner();
		
//		�ν��Ͻ� Ŭ������ �ܺ� Ŭ������ ���� �����ϸ� ���� ����
		Ex7_028 outer = new Ex7_028();
		InstanceInner obj1 = outer.new InstanceInner();
	}
	void instanceMethod() {
//		�ν��Ͻ��޼��忡���� �ν��Ͻ������ static��� ��� ���� ����
		InstanceInner obj1 = new InstanceInner();
		StaticInner obj2 = new StaticInner();
//		LocalInner lv = new LocalInner(); ���� -> �޼��� �� ���������� ���� -> �ܺο��� ���� x
	}
	void myMethod() {
		class LocalInner{}
		LocalInner lv = new LocalInner();
	}

}