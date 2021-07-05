/*
 * ��¥: 2021/05/19
 * ����: �ڹ��� ����_StringBufferŬ����
 * �̸�: ���ϸ�
 * ������ �迭 char[]�� ���������� ������ ����
 * String�� �޸� ������ ������ �� ����
 * equals()�� �������̵� �Ǿ����� ����(�ּҺ� �̷����)
 * -> StringBuffer�� String���� ��ȯ �� equals() �� 
 */
public class Ex9_008 {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("abc");
		StringBuffer sb2 = new StringBuffer("abc");
		
//		equals()�� �������̵� �Ǿ� ���� �ʾ� ��� ���� false��ȯ
		System.out.println("sb == sb2 ? "+ (sb == sb2));
		System.out.println("sb.equals(sb2) ? "+ sb.equals(sb2));
	
		System.out.println();
		
//		String���� ��ȯ �� equals() ��
		String s = sb.toString();
		String s2 = sb2.toString();
		
		System.out.println("s.equals(s2) ? "+ s.equals(s2));
	}
}