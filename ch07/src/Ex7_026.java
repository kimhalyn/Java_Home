/*
 * ��¥: 2021/05/15
 * ����: �ڹ��� ����_���� Ŭ����
 * �̸�: ���ϸ�
 * Ŭ���� �ȿ� Ŭ����
 * ����: ���� Ŭ�������� �ܺ� Ŭ���� ����� ���� ������ �� ����, �ڵ��� ���⼺�� ���� �� ����(ĸ��ȭ)
 */
class AAA{ //class AAA -> class BBB�� �ܺ� Ŭ���� 
	int i = 100;
	BBB b = new BBB();
	
	//class BBB -> class AAA�� ���� Ŭ����
	class BBB{
		void method() {
//			AAA a = new AAA();
//			System.out.println("i: "+ a.i);
			System.out.println(i); //��ü �������� �ܺ� Ŭ���� ��������� ���� ����
		}
	}
}
class CCC{
//	BBB b = new BBB(); ���� -> class BBB�� class AAA�� ���ο����� ���Ǳ� ����
}

public class Ex7_026 {

	public static void main(String[] args) {
//		class BBB�� AAA�� ���� Ŭ������ �Ǿ��� ������ -> ���� AAA�� ���� ��ü�� ������ �� ��� ����
//		BBB b = new BBB();
//		b.method();
	}
} 
