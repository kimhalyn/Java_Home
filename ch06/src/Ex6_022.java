/*
 * ��¥: 2021/05/10
 * ����: �ڹ��� ����_������ �ʱ�ȭ(��������� �ʱ�ȭ �ñ�� ����)
 * �̸�: ���ϸ�
 * �������(iv, cv)�� �ڵ� �ʱ�ȭ
 * ��������(lv)�� ���� �ʱ�ȭ(�޼��� ������ ����Ǿ� ���)
 * �ʱ�ȭ ���: 1.�ڵ� �ʱ�ȭ, 2.���� �ʱ�ȭ(���Կ����� '=' ���), 3.���� �ʱ�ȭ(cv�� �� -> static{}, iv�� �� -> ������ ���)
 */ 
class Product{
	static int count = 0;
	int serialNo;
	{
		++count;
		serialNo = count;
	}
	public Product() {} //�⺻ ������, ���� ����
}
public class Ex6_022 {	
	public static void main(String[] args) {
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		Product p4 = new Product();
		
		System.out.println("p1�� ��ǰ��ȣ(serial no)�� "+ p1.serialNo);
		System.out.println("p2�� ��ǰ��ȣ(serial no)�� "+ p2.serialNo);
		System.out.println("p3�� ��ǰ��ȣ(serial no)�� "+ p3.serialNo);
		System.out.println("����� ��ǰ�� ���� ��� "+ Product.count +"�� �Դϴ�.");
		
		
	}
	
}
		


