/*
 * ��¥: 2021/05/07
 * ����: �ڹ��� ����_StringŬ����
 * �̸�: ���ϸ�
 * StringŬ���� = char[] + �޼���(���, �Լ�)
 * StringŬ������ ������ ������ �� ����(Read Only)
 * charAt(index): ���ڿ����� Ư�� index�� ��ȯ
 * length(): ���ڿ� ���� ��ȯ
 * substring(from, to-1): ���ڿ����� �ش� ������ �ִ� �� ��ȯ
 * equals(): ���ڿ��� ������ ������ �Ǻ�(true, false), ��ҹ��� ����
 * equals.IgnoreCase(): ��ҹ��� ���� ���� -> ������ ��ġ���� �Ǻ�
 * */
public class EX5_012 {

	public static void main(String[] args) {
		
		String src = "ABCDE";
		
		//charAt
		for(int i=0; i<src.length(); i++) {
			char ch = src.charAt(i);
			System.out.println("scr.charAt("+ i +") :"+ ch);
		}
		
		//substring
		String str2 = src.substring(1,4); //�ε��� 1~3���� ����
		System.out.println("str2:"+ str2);
		
		String str3 = src.substring(2); //�ε��� 2���� ������ ����(2, str.length())
		System.out.println("str3:"+ str3);
		
		//char[] tochararray
		char[] chArr = src.toCharArray(); //���ڿ��� ���ڹ迭�� ��ȯ
		System.out.println(chArr);
			
	}
		
}
