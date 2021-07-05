/*
 * ��¥: 2021/05/10
 * ����: �ڹ��� ����_�����ε�(overloading)
 * �̸�: ���ϸ�
 * 1���� �޼��� �̸��� ���� ���� �޼��带 ����(��. println)
 * �����ε� ��������
 * 1. �޼��� �̸��� ���ƾ� ��(=�ϴ� ���� ����)
 * 2. �Ű����� ���� �Ǵ� Ÿ���� �޶�� �� (���� ������ -> �ߺ����Ƿ� ���� �߻�)
 * 3. ��ȯ Ÿ���� ���� ����
 */ 
class MyMath3{
	
	int add(int a, int b) {
		System.out.printf("int add(int a, int b) - ");
		return a+b;
	}
	long add(int a, long b) {
		System.out.printf("int add(int a, long b) - ");
		return a+b;
	}
	long add(long a, int b) {
		System.out.printf("int add(long a, int b) - ");
		return a+b;
	}
	long add(long a, long b) {
		System.out.printf("int add(long a, long b) - ");
		return a+b;
	}
	int add(int[] a) {
		System.out.print("int add(int[] a) - ");
		int result = 0;
		for(int i=0; i<a.length; i++) {
			result += a[i];
		}
		return result;
	}
}

public class Ex6_016 {	
	public static void main(String[] args) {

		MyMath3 mm = new MyMath3();
		System.out.println("mm.add(3, 3) ���:"+ mm.add(3, 3));
		System.out.println("mm.add(3L, 3) ���:"+ mm.add(3L, 3));
		System.out.println("mm.add(3, 3L) ���:"+ mm.add(3, 3L));
		System.out.println("mm.add(3:, 3L) ���:"+ mm.add(3L, 3L));
		
		int[] a = {100, 200, 300};
		System.out.println("mm.add(a) ���:"+ mm.add(a));
	}
}
