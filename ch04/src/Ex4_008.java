import java.util.Scanner;
/*
 * ��¥: 2021/05/06
 * ����: �ڹ��� ����_���ǹ�(switch���� �̿��Ͽ� ������ ���� �����)
 * �̸�: ���ϸ�
 * 0.0 <= Math.random() < 1.0 - 0.0�� 1.0������ ������ double���� ��ȯ
 * */
public class Ex4_008 {

	public static void main(String[] args) {
	
		System.out.printf("����(1), ����(2), ��(3) �� �ϳ��� �Է��ϼ���.>");
		
		Scanner scanner = new Scanner(System.in);
		int user = scanner.nextInt();
		int com = (int)(Math.random() * 3) + 1; //1,2,3 �� �ϳ��� com�� �����
		
		System.out.println("����� "+ user +"�Դϴ�");
		System.out.println("���� "+ com +"�Դϴ�");
		
		switch(user-com) {
			case 2: case -1:
				System.out.println("����� �����ϴ�");
				break;
			case 1: case -2: 
				System.out.println("����� �̰���ϴ�.");
				break;
			case 0:
				System.out.println("�����ϴ�.");
				break; //��� ������ ������ break�� ����� �ʿ� ����
		
		}
		
	}
}
