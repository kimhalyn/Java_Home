import java.util.Scanner;

/*
 * ��¥: 2021/05/06
 * ����: �ڹ��� ����_�̸� ���� �ݺ���
 * �̸�: ���ϸ�
 * */
public class Ex4_030 {

	public static void main(String[] args) {

		int menu = 0;
		int num = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		outer:
		while(true) { //���� �ݺ���
			System.out.println("(1) square");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			System.out.printf("���ϴ� �޴�(1~3)�� �����ϼ���. (����:0)>");
			
			String tmp = scanner.nextLine();
			menu = Integer.parseInt(tmp);
			
			if(menu==0) {
				break;
			}else if(!(1 <= menu && menu <= 3)) {
				System.out.println("�޴��� �߸� �����ϼ̽��ϴ�.(����� 0)");
				continue;
			}
			
			for(;;) { //���� �ݺ���
				System.out.print("����� ���� �Է��ϼ���. (��� ����:0. ��ü ����:99)>");
				tmp = scanner.nextLine();
				num = Integer.parseInt(tmp);
				
				if(num==0)
					break; //for�� ����
				
				if(num==99)
					break outer; //��ü while�� ����
				
				switch(menu) {
					case 1:
						System.out.println("result= "+ num*num);
						break;
					case 2:
						System.out.println("result ="+ Math.sqrt(num));
						break;
					case 3:
						System.out.println("result= "+Math.log(num));
						break;
				}
			} //for(;;)
		} //while
		System.out.println("���α׷��� ����Ǿ����ϴ�.");
	}
}
