/*
 * ��¥: 2021/05/04 
 * ����: �ڹ��� ����_�������� �Ǽ��� ���� ����ȯ(Casting)
 * �̸�: ���ϸ�
 * ���������� �Ǽ������� ����ȯ -> ���е��� �Ѱ�� ���� �߻� ���ɼ� ����
 * float(�Ҽ��� �Ʒ� 6�ڸ�)  -> ���е��� 7�ڸ�  -> 8�ڸ� ���� ���� �� ���� �߻�
 * double(�Ҽ��� �Ʒ� 6�ڸ�) -> ���е��� 15�ڸ� -> 8�ڸ� ���� ���� �� �������� ��ȯ ����
 * */
public class Ex2_014 {

	public static void main(String[] args) {

		int i = 91234567;
		float f = (float)i; //int -> float
		int i2 = (int)f; //float -> int
		
		double d = (double)i; //int -> double
		int i3 = (int)d; //double -> int
		
		float f2 = 1.666f;
		int i4 = (int)f2; //float -> int
		
		System.out.printf("i=%d%n", i);
		System.out.printf("f=%f i2=%d%n", f, i2);
		System.out.printf("d=%f i3=%d%n", d, i3);
		System.out.printf("(int)%f=%d%n", f2, i4);
		
		
	}
	
}
