/*
 * ��¥: 2021/05/05
 * ����: �ڹ��� ����_��Ģ ������
 * �̸�: ���ϸ�
 * */
public class Ex3_006 {

	public static void main(String[] args) {
		
		byte a = 10;
		byte b = 20;
		
//		byte c = a + b; ������ ����. "Type mismatch: cannot convert from int to byte" 
//		-> int�� �ڷḦ �� ���� byte�� �ֱ� ���ؼ� -> ������ ����ȯ�ؾ���
		byte c = (byte)(a+b);
		System.out.println(c);
		
		
	}
	
}
