/*
 * ��¥: 2021/05/05
 * ����: �ڹ��� ����_��Ģ ������
 * �̸�: ���ϸ�
 * intŸ�� �ִ�  -> 2X10�� 9��
 * */
public class Ex3_008 {
	public static void main(String[] args) {
	
		int a = 1_000_000;
		int b = 2_000_000;
		
		long c = a * b;  //int*int=int -> �� �ս� �߻�
		System.out.println(c);
		
		long d = (long)a * b; //a�� b �� �ϳ��� ����ȯ�Ͽ� ���
		System.out.println(d);
	}
	
}
