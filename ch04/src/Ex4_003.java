import java.util.Scanner;
/*
 * ��¥: 2021/05/06
 * ����: �ڹ��� ����_���ǹ�(if-else��)
 * �̸�: ���ϸ�
 * if-else��: �� ���� ���ǽ��� ���� 
 * */
public class Ex4_003 {

	public static void main(String[] args) {
	
		System.out.printf("���ڸ� �ϳ� �Է��ϼ���.>");
		
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt(); //ȭ���� ���� �Է¹��� ���ڸ� input�� ����
		
		
		if(input==0) {
			System.out.println("�Է��Ͻ� ���ڴ� 0�Դϴ�.");
		} else {
			System.out.println("�Է��Ͻ� ���ڴ� 0�� �ƴմϴ�.");
		}
		
	}
	
}
