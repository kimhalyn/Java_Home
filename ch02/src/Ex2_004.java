/*
 * ��¥: 2021/05/04 
 * ����: �ڹ��� ����_���� ���ͷ��� ���ڿ� ���ͷ�
 * �̸�: ���ϸ�
 */
public class Ex2_004 {

	public static void main(String[] args) {
		
		//���� ���ͷ�
		char ch = 'A'; //���� ����ǥ���� ����, �� ���� ��� �Ұ�(�ݵ�� �ϳ��� ���ڰ� �����ؾ� ��)
		int i = 'A';
		
		//���ڿ� ���ͷ�
		String str1 = "";
		String str2 = "ABCD";
		String str3 = "1234";
		String str4 = str2 + str3;
		
		System.out.println(ch);
		System.out.println(i);
		System.out.println(str4);
		
		
		String name = "ja" + "va"; //���ڿ��� ���ڿ��� ����
		String str = name + " " + 8.0;
		
		System.out.println(name);
		System.out.println(str);
		System.out.println(7 + " ");
		System.out.println(" " + 7);
		System.out.println(7 + "");
		System.out.println("" + 7);
		System.out.println("" + "");
		System.out.println(7 + 7 + "");
		System.out.println("" + 7 + 7); //�� ���ڿ� + ���� = ���ڰ� ���ڿ��� ��ȯ ��? ���ڿ��� ���ڿ��ϰ� ���� �����ϱ� ����
	}
}
