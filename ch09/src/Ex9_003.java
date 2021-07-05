/*
 * ��¥: 2021/05/18
 * ����: �ڹ��� ����_ObjectŬ����_hashCode()
 * �̸�: ���ϸ�
 * ��ü�� �ؽ��ڵ�(������)�� ��ȯ�ϴ� �޼���
 * ��ü�� �ּҸ� int�� ��ȯ�ؼ� ��ȯ
 * equals()�� �������̵��ϸ� hashCode()�� �������̵��ؾ� ��
 * identityHashCode(): ������ �ؽ��ڵ� �� ��ȯ(�ּ�) 
 */

public class Ex9_003 {

	public static void main(String[] args) {

		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		
	}
}