import java.util.Scanner;

/*
 * ��¥: 2021/05/06
 * ����: �ڹ��� ����_�ݺ���(while��)
 * �̸�: ���ϸ�
 * */
public class Ex4_022 {

	public static void main(String[] args) {

		int num = 0, sum = 0;
		System.out.printf("���ڸ� �Է��ϼ���.(��:12345)>");
		
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine();
		num = Integer.parseInt(tmp);
		
		while(num!=0) {
			sum+=num%10; 
			System.out.printf("sum=%3d num=%d%n", sum, num);
			
			num /= 10;
		}
		System.out.println("�� �ڸ����� ��: "+sum);
	}
}
