/*
 * ��¥: 2021/05/10
 * ����: �ڹ��� ����_�޼���(�ݵ�� Ŭ���� �ȿ� �־�� ��)
 * �̸�: ���ϸ�
 * �޼���: 1)���� ������� ������� ��, 2)��(�Է�)�� �޾Ƽ� ó���ϰ�, ����� ��ȯ(���)
 * �޼��� ����: �ߺ��ڵ�����, ��������, ���� ����, ���α׷� ����ȭ
 * �޼��� �ۼ�: �ݺ������� ����Ǵ� ���� ������ �޼���� �ۼ�, �ϳ��� �޼���� �ϳ��� ��ɸ� �����ϵ��� ����
 * */

//(1)�޼��� �ۼ�
class MyMath {
	long add(long a, long b) { // �Ű����� long a, long b
		long result = a + b;
		return result; // ��ȯ�� ����(return)
	}

	long subtract(long a, long b) {
		return a - b;
	}

	long multiply(long a, long b) {
		return a * b;
	}

	double divide(double a, double b) {
		return a / b;
	}
}

public class Ex6_008 {
	public static void main(String[] args) {

//		�޼��� ���� - ��������(a, b, result)
//		int add(int a, int b) { �޼��� ����� (Ÿ��, �޼��� �̸�, �Ű����� ����(0~n��))
//			�޼��� ������
//			int result = a + b; 
//			return result; ��°��� 0~1��
//		}
//		int result = add(3, 5); add�޼��带 ȣ���ϰ� ����� result ������ ����
//		print99danAll(); void print99danAll()�� ȣ��, void Ÿ�� -> ��ȯ���� ����

		MyMath mm = new MyMath(); // (2) ��ü ����
		// (3) ��ü ���
		long result1 = mm.add(5L, 3L); // add�޼��� ȣ�� -> �۾��� ��ġ�� ȣ���� ������ ���ƿ�
		long result2 = mm.subtract(5L, 3L);
		long result3 = mm.multiply(5L, 3L);
		double result4 = mm.divide(5L, 3L);

		System.out.println("add(5L, 3L) = " + result1);
		System.out.println("subtract(5L, 3L) = " + result2);
		System.out.println("multiply(5L, 3L) = " + result3);
		System.out.println("divide(5L, 3L) = " + result4);

	}
}
