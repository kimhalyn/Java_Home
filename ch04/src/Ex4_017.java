/*
 * ��¥: 2021/05/06
 * ����: �ڹ��� ����_�ݺ���(��ø for��)
 * �̸�: ���ϸ�
 * for�� ���� �� �ٸ� for���� ����
 * */
public class Ex4_017 {

	public static void main(String[] args) {
	
		//�� ����� (1)
		
		for(int i=1; i<=5; i++) {
			System.out.println("**********");
		}
		
		System.out.println();
		
		//�� ����� (2)
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=10; j++) {
				System.out.print("*"); //���� ����̶� print�� ���
			}
			System.out.println();
		}
		
		System.out.println();
		
		//�ﰢ�� ����� (1)
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
