/*
 * ��¥: 2021/05/10
 * ����: �ڹ��� ����_������ �ʱ�ȭ(�ʱ�ȭ ��)
 * �̸�: ���ϸ�
 * Ŭ���� �ʱ�ȭ ���� ó�� �޸𸮿� �ε��� �� �� ���� ����
 * �ν��Ͻ� �ʱ�ȭ ���� �ν��Ͻ��� ������ ������ ����
 * �׻� Ŭ���� ������ �ν��Ͻ� �������� ���� ����
 */ 
class Ex6_020 {	

	static {
		System.out.println("static()");
	}
	{
		System.out.println("{}");
	}
	public Ex6_020() {
		System.out.println("������");
	}
	
	public static void main(String[] args) {

		System.out.println("Ex6_020 ex1 = new Ex6_020(); ");
		Ex6_020 ex1 = new Ex6_020();
		
		System.out.println("Ex6_020 ex2 = new Ex6_020(); ");
		Ex6_020 ex2 = new Ex6_020();
	}
}
