import java.util.Scanner;

/*
 * ��¥: 2021/05/06
 * ����: �ڹ��� ����_�ݺ���(��ø for��)
 * �̸�: ���ϸ�
 * for�� ���� �� �ٸ� for���� ����
 * */
public class Ex4_018 {

	public static void main(String[] args) {
	
		//�ﰢ�� ����� (2)
		int num = 0;
		
		System.out.printf("*�� ����� ������ ���� �Է��ϼ���.>");
		
		
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine();
		
		num = Integer.parseInt(tmp);
		
		for(int i=0; i<num; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=1; i<=num; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("&");
			}
			System.out.println();
		}
		
	}
}
