import java.util.Scanner;

/*
 * ��¥: 2021/05/06
 * ����: �ڹ��� ����_���ǹ�(��ø if��)
 * �̸�: ���ϸ�
 * ��ø if��: if�� �ȿ� if��
 * */
public class Ex4_005 {

	public static void main(String[] args) {
	
		int score = 0;
		char grade = ' ', opt = '0'; //opt �ʱⰪ�� 0���� ����
		
		System.out.printf("������ �Է����ּ���.>");
		
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt();
		
		System.out.printf("����� ������ %d�Դϴ�.%n", score);
		
		if(score >= 90) {
			grade = 'A';
			if(score >= 98) {
				opt = '+';
			} else if(score < 94) {
				opt = '-';
			}
		} else if(score >= 80) {
			grade = 'B';
			if(score >=88) {
				opt = '+';
			} else if(score < 84) {
				opt = '-';
			}
		}else {
			grade = 'C';
		}
		System.out.printf("����� ������ %c%c�Դϴ�.%n", grade, opt);
		
	}
	
}
