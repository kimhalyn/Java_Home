import java.util.Scanner;
/*
 * ��¥: 2021/05/06
 * ����: �ڹ��� ����_���ǹ�(if��)
 * �̸�: ���ϸ�
 * ��{}�� �̿��Ͽ� ���� ������ �ϳ��� ���� �� ����
 * �ٸ�, ��{} �ڿ��� ������ ���� �ǹ��ϴ� ';'�� ������ ����
 * */
public class Ex4_002 {

	public static void main(String[] args) {
		
		int input;
		System.out.printf("���ڸ� �ϳ� �Է��ϼ���.>");
		
		
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine(); //ȭ���� ���� �Է¹��� ������ tmp�� ����
		input = Integer.parseInt(tmp); // �Է¹��� tmp�� ���ڷ� ��ȯ
		
		if(input==0) {
			System.out.println("�Է��Ͻ� ���ڴ� 0�Դϴ�.");
		}
	
		//��ȣ���� if���� �ۼ� -> �� ���常 if���� ����
		if(input!=0) 
			System.out.println("�Է��Ͻ� ���ڴ� 0�� �ƴմϴ�."); //if���� ���� ����
			System.out.printf("�Է��Ͻ� ���ڴ� %d�Դϴ�.", input); //if�� ���� ���� -> �׻� ��µ� 
		
	}
	
}
