/*
 * ��¥: 2021/05/06
 * ����: �ڹ��� ����_�ݺ���(for��)
 * �̸�: ���ϸ�
 * ������ �����ϴ� ���� ��{}�� �ݺ� -> �ݺ�Ƚ���� �� �� ����
 * */
public class Ex4_015 {

	public static void main(String[] args) {
	
		System.out.println("i \t 2*i \t 2*i-1 \t i*i \t 11-i \t i%3 \t i/3");
		System.out.println("--------------------------------------------------------");
		
		for(int i=1; i<=10; i++) {
			System.out.printf("%3d \t %3d \t %3d \t %3d \t %3d \t %3d \t %3d%n", i, 2*i, 2*i-1, i*i, 11-i, i%3, i/3 );
		}
	}
}
