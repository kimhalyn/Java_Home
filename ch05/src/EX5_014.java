/*
 * ��¥: 2021/05/07
 * ����: �ڹ��� ����_Ŀ�ǵ� ���� �Է¹ޱ�
 * �̸�: ���ϸ�
 * */
public class EX5_014 {

	public static void main(String[] args) {

		if(args.length!=3) {
			System.out.println("usage: java ArarayEx014 NUM1 OP NUM2");
			System.exit(0); //�ý����� ������
		}
		int num1 = Integer.parseInt(args[0]); //���ڿ��� ���ڷ� ��ȯ
		char op = args[1].charAt(0); //���ڿ��� ���ڷ� ��ȯ
		int num2 = Integer.parseInt(args[2]);
		int result = 0;
		
		switch(op) {
			case '+':
				result = num1 + num2;
				break;
			case '-':
				result = num1 - num2;
				break;
			case 'x':
				result = num1 * num2;
				break;
			case '/':
				result = num1 / num2;
				break;
			default :
				System.out.println("�������� �ʴ� �����Դϴ�.");
		}
		System.out.println("��� :"+ result);
	}
}
