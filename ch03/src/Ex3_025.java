import java.util.Scanner;

/*
 * ��¥: 2021/05/05
 * ����: �ڹ��� ����_���� ������
 * �̸�: ���ϸ�
 * */
public class Ex3_025 {
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		char ch = ' ';
		
		System.out.printf("���ڸ� �ϳ� �Է��ϼ���.");
		
		String input = scanner.nextLine(); //���ڿ��� �ޱ�
		ch = input.charAt(0); //���ڿ����� ������ ��ġ�� ���� �ϳ��� �������� �޼���
		
		if('0' <= ch && ch <= '9') {
			System.out.printf("�Է��Ͻ� ���ڴ� �����Դϴ�.%n");
		}

		if(('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z')) {
			System.out.printf("�Է��Ͻ� ���ڴ� �������Դϴ�.%n");
		}
	}
}