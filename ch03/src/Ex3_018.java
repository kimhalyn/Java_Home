/*
 * ��¥: 2021/05/05
 * ����: �ڹ��� ����_��Ģ ������
 * �̸�: ���ϸ�
 * */
public class Ex3_018 {
	public static void main(String[] args) {
	
		//Math.round() �Ǽ��� �Ҽ� ù °�ڸ����� �ݿø� 
		double pi = 3.141592;
		double shortPi = Math.round(pi * 1000) / 1000.0; //int / double=double
		
		System.out.println(shortPi);
		
		//3.141�� ��������?
		System.out.println((int)(pi*1000)/1000.0);
		
		
	
	}
	
}
