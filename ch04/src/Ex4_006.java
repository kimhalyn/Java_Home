import java.util.Scanner;

/*
 * ��¥: 2021/05/06
 * ����: �ڹ��� ����_���ǹ�(switch��)
 * �̸�: ���ϸ�
 * switch��: ó���ؾ� �ϴ� ����� ���� ���� �� ���� 
 * ���������� ������ - ���ǽ� ����� ���� �Ǵ� ���ڿ�
 *              - case���� ���� ���, ����, ���ڿ� ���� (����, �Ǽ� �Ұ�)
 *              - case �ߺ� �Ұ�
 * */
public class Ex4_006 {

	public static void main(String[] args) {

		System.out.printf("���� ���� �Է��ϼ���.>");

		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();

		switch (month) {
		case 3:
		case 4:
		case 5:
			System.out.println("���� ������ ���Դϴ�.");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("���� ������ �����Դϴ�.");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("���� ������ �����Դϴ�.");
			break;
		default:
//			case 12: case 1: case 2:
			System.out.println("���� ������ �ܿ��Դϴ�.");
		}
//		switch���� if������ �ۼ�
		if (month == 3 || month == 4 || month == 5) {
			System.out.println("����� ���Դϴ�.");
		} else if (month == 6 || month == 7 || month == 8) {
			System.out.println("����� �����Դϴ�.");
		} else if (month == 9 || month == 10 || month == 11) {
			System.out.println("����� �����Դϴ�.");
		} else {
			System.out.println("����� �ܿ��Դϴ�.");
		}

	}
}
