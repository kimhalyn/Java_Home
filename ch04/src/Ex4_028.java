import java.util.Scanner;

/*
 * ��¥: 2021/05/06
 * ����: �ڹ��� ����_continue��(2)
 * �̸�: ���ϸ�
 * */
public class Ex4_028 {

	public static void main(String[] args) {

		int menu = 0;
		int num = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) { //���� �ݺ���
			System.out.println("(1) square");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			System.out.printf("���ϴ� �޴�(1~3)�� �����ϼ���. (����:0)>");
			
			String tmp = scanner.nextLine();
			menu = Integer.parseInt(tmp);
			
			if(menu==0) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}else if(!(1 <= menu && menu <= 3)) {
				System.out.println("�޴��� �߸� �����ϼ̽��ϴ�.(����� 0)");
				continue; //while������ �̵�
			}
			System.out.println("�����Ͻ� �޴��� "+ menu +"���Դϴ�.");
		} //while�� ����
		System.out.println("break�� ��������");
	}
}
