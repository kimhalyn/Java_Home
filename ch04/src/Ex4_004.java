import java.util.Scanner;

/*
 * ��¥: 2021/05/06
 * ����: �ڹ��� ����_���ǹ�(if-else if��)
 * �̸�: ���ϸ�
 * if-else if��: ���� ���� ���ǽ��� ������ ���ǽ�
 * */
public class Ex4_004 {

	public static void main(String[] args) {
	
		int score  = 0; //������ �����ϱ� ���� ����
		char grade = ' '; //������ �����ϱ� ���h ����, �������� �ʱ�ȭ
		
		System.out.printf("������ �Է��ϼ���.>");
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt(); //ȭ�鿡 �Է¹��� ���ڸ� score�� ����

//		char grade = 'D'; grade�� D�� �ʱⰪ�ϸ� else�� ��� ��(�ڵ� ����ȭ)
		if(score >= 90) {
			grade = 'A';
		} else if(score >= 80) {
			grade = 'B';
		} else if(score >= 70) {
			grade = 'C';
		} else {
			grade = 'D';
		}
		System.out.println("����� ������ "+ grade +"�Դϴ�.");
		
		
	}
	
}
