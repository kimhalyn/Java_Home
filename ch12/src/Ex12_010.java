/*
 * ��¥: 2021/06/02
 * ����: �ڹ��� ����_ǥ�ؾֳ����̼�
 * �̸�: ���ϸ�
 * �ֳ����̼�: �ּ�ó�� ���α׷��� �� ������ ��ġ�� ������ ������ ������ ����
 * @Override: �������̵��� �ùٸ��� �ߴ��� Ȯ��
 * @Deprecated: ������ ������� ���� ���� ������ �� ǥ��
 * @FunctionalInterface: �Լ��� �������̽��� ���̸� �����Ϸ� üũ, �ϳ��� �߻� �޼��常 ������ ��
 * @SuppressWarnings: �����Ϸ� ���޽����� ��Ÿ���� �ʰ� ��
 */
class Parent{
	void parentMethod() {}
}
class Child extends Parent {
	@Override
	@Deprecated
	void parentMethod() {} //���� �޼��� �̸� �߸� �ۼ� -> ������ ����
}

@FunctionalInterface //�Լ��� �������̽��� 1���� �߻� �޼��常 ���� �� �ִµ�, 2���� �޼��带 ������ ���� �߻�
interface Testable{ 
	void test(); //�߻�޼���
//	void check(); �߻�޼���
}

class EX12_010{
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		Child c = new Child();
		c.parentMethod(); //Deprecated�� �޼��� ���
	}
}
