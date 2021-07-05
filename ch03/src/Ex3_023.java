/*
 * ��¥: 2021/05/05
 * ����: �ڹ��� ����_���ڿ� �� ������
 * �̸�: ���ϸ�
 * ���ڿ� �񱳿��� ==��� equals()�� ����ؾ� ��
 * '==': ���ڿ��� ������ ������ ��
 * equals(): ���ڿ� ������ ������ ��
 * ��ҹ��� �������� �ʰ� ���ϰ� ���� �� -> equalsIgnoreCase()
 * */
public class Ex3_023 {
	public static void main(String[] args) {
	
		String str1 = "abc";
		String str2 = new String("abc");
		
		System.out.printf("\"abc\"==\"abc\" ? %b%n", "abc"=="abc");
		System.out.printf(" str1==\"abc\" ? %b%n", str1=="abc");
		//������ ���Ƶ� ���� �ٸ� ��ü�� false, equals()�� �������� �Ǵ��ϹǷ� ������� ��Ȯ
		System.out.printf(" str2==\"abc\" ? %b%n", str2=="abc");
		
		System.out.printf("str1.equals(\"abc\") ? %b%n", str1.equals("abc"));
		System.out.printf("str2.equals(\"abc\") ? %b%n", str2.equals("abc"));
		System.out.printf("str2.equals(\"ABC\") ? %b%n", str2.equals("ABC"));
		
		//��ҹ��� �������� �ʰ� ���ϰ� ���� �� -> equalsIgnoreCase()
		System.out.printf("str2.equalsIgnoreCase(\"ABC\") ? %b%n", str2.equalsIgnoreCase("ABC"));
	
	}
	
}
