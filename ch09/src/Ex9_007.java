/*
 * ��¥: 2021/05/19
 * ����: �ڹ��� ����_���ڿ��� �⺻�� ���� ��ȯ
 * �̸�: ���ϸ�
 */
public class Ex9_007 {

	public static void main(String[] args) {

		//���ڸ� ���ڿ��� �ٲٴ� ���
		int i = 100;
		String str1 = i + "";
		String str2 = String.valueOf(i);
		
		double d = 200.0;
		String str3 = String.valueOf(d);
		
		double sum = Integer.parseInt(str1)+ Double.parseDouble(str3);
		double sum2 = Integer.valueOf(str1)+ Double.valueOf(str3);
		
		System.out.println(String.join("", str1,"+",str3,"=")+sum);
		System.out.println(str1 +"+"+ str3 +"="+ sum2);
		
	
		//���ڿ��� ���ڷ� �ٲٴ� ���
		int i1 = Integer.parseInt("100");
		int i2 = Integer.valueOf("100"); //int -> �⺻�� ����
		Integer i3 = Integer.valueOf("100"); //Integer -> ������ ����
		
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
	}
}