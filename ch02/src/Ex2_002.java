/*
 * ��¥: 2021/05/04 
 * ����: �ڹ��� ����_�� ���� �� ��ȯ(x,y�� ��ȯ)
 * �̸�: ���ϸ�
 */
public class Ex2_002 {

	public static void main(String[] args) {
		
		int x = 10, y = 20;
		int temp = 0;
		
		System.out.println("x:"+ x + " y:" + y);
		
		temp = x;
		x = y;
		y = temp;
		
		System.out.println("x:" + x + " y:" + y);
	}
}
