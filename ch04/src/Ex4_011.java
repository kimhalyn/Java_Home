import java.util.Scanner;
/*
 * ��¥: 2021/05/06
 * ����: �ڹ��� ����_���ǹ�(switch�� ��ø)
 * �̸�: ���ϸ�
 * break; ������ �ʰ� ����!
 * */
public class Ex4_011 {

	public static void main(String[] args) {
	
	System.out.printf("����� �ֹι�ȣ�� �Է��ϼ���.(����:011231-1111222)>");
		
		Scanner scanner = new Scanner(System.in);
		String regNo = scanner.nextLine(); //���ڰ� �־ ���ڿ���
		
		char gender = regNo.charAt(7); //�Է¹��� ��ȣ�� 8��° ���ڸ� gender�� ���� charAt(index)
		
		switch(gender) {
		case '1': case '3':
			switch(gender) {
				case '1':
					System.out.println("����� 2000�� ������ ����� �����Դϴ�.");
					break;
				case '3':
					System.out.println("����� 2000�� ���Ŀ� ����� �����Դϴ�.");
				}
				break;
		case '2': case '4':
			switch(gender) {
				 case '2':
					 System.out.println("����� 2000�� ������ ����� �����Դϴ�.");
					 break;
				 case '4':
					 System.out.println("����� 2000�� ���Ŀ� ����� �����Դϴ�.");
					 break;
				 }
//				break;�� ���� �����Ƿ� -> case '2': case '4':������ ������� �ʰ� -> default������ �̵�	
			default:
				System.out.println("��ȿ���� ���� �ֹε�Ϲ�ȣ�Դϴ�.");
		}
				
		
		
	}
}
