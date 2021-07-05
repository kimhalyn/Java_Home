/*
 * ��¥: 2021/05/18
 * ����: �ڹ��� ����_StringŬ����
 * �̸�: ���ϸ�
 * StringŬ���� -> ������(���ڹ迭) + �޼���(���ڿ� ����)
 * ������ ������ �� ���� Ŭ����(immutableŬ����)
 * ���� ������ ���� �����ؾ� �Ѵٸ� -> StringBuffer���
 * 
 * ���ڿ� ���ͷ�: ���α׷� ���� �� -> �ڵ����� ����
 * �� ���ڿ�(""): ������ ���� ���ڿ�, ũ�Ⱑ 0, ���ڿ� �ʱ�ȭ�� ���
 * 
 * ���ڿ� �ʱ�ȭ String s = "";(�� ���ڿ�)
 * ���� �ʱ�ȭ char c = ' ';(����)
 */
public class Ex9_005 {

	public static void main(String[] args) {

		String str1 = "abc";
		String str2 = "abc";

		System.out.println("String str1 = \"abc\";");
		System.out.println("String str2 = \"abc\";");

		System.out.println("str1 == str2 ? " + (str1 == str2));
		System.out.println("str1.equals(str2) ? " + str1.equals(str2));
		System.out.println();

		String str3 = new String("\"abc\"");
		String str4 = new String("\"abc\"");

		System.out.println("String str3 = new String(\"abc\");");
		System.out.println("String str4 = new String(\"abc\");");

		System.out.println("str3 == str4 ? " + (str3 == str4));
		System.out.println("str3.equals(str4) ? " + str3.equals(str4));
	}
}