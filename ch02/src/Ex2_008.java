import java.util.Scanner;

/*
 * ��¥: 2021/05/04
 * ����: �ڹ��� ����_ȭ�鿡�� �Է¹ޱ�-Scanner
 * �̸�: ���ϸ�
 * 
 * ���ڸ� ���ڿ���: ���� + ""
 * ���ڿ��� ���ڷ�: Integer.parseInt()
 */
public class Ex2_008 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //ScannerŬ���� ��ü ����
		
//		int num1 = scanner.nextInt();
//		int num2 = scanner.nextInt();
//		System.out.println(num1);
//		System.out.println(num2);
		
		System.out.println("���ڸ� ������ �ϳ� �Է����ּ���.");
		
		String input = scanner.nextLine(); //�Է¹��� ������ input�� ����
		int num = Integer.parseInt(input);//�Է¹��� ���ڿ� input�� ���ڷ� ��ȯ
		
		System.out.println("�Է³��� :"+input);
		System.out.printf("num=%d%n", num);
		
		
		
		
	}
}
