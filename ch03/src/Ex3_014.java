/*
 * ��¥: 2021/05/05
 * ����: �ڹ��� ����_��Ģ ������
 * �̸�: ���ϸ�
 * */
public class Ex3_014 {
	public static void main(String[] args) {

	char c = 'a';
	for(int i=0; i<26; i++) { //����{}���� ������ 26�� �ݺ�
		System.out.print(c++); //'a'���� 26�� ���� ���
	}
	System.out.println(); //����
	
	c = 'A';
	for(int i=0; i<26; i++) { //����{}���� ������ 26�� �ݺ�
		System.out.print(c++); //'A'���� 26�� ���� ���
	}
	System.out.println(); //����
		
	c = '0';
	for(int i=0; i<10; i++) { //����{}���� ������ 10�� �ݺ�
		System.out.print(c++); //'0'���� 10�� ���� ���
	}
	System.out.println(); //����
	}
	
}