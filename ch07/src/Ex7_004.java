/*
 * ��¥: 2021/05/13
 * ����: �ڹ��� ����_�������̵�
 * �̸�: ���ϸ�
 * ��ӹ��� ������ �޼��带 �ڽſ� �°� ����
 * ����δ� ���� x, ������ {}�� ���� o
 * �������̵� ����: - ����ΰ� ���� Ŭ���� �޼���� ��ġ
 *              - ���� ������(public, protected, default, private)�� ���� Ŭ������ �޼��庸�� ���� ������ ������ �� ����
 *              - ���ܴ� ���� Ŭ������ �޼��庸�� �� ���� ������ �� ����
 */
class Point{
	int x;
	int y;
	
	Point(int x, int y){ //������
		this.x = x;
		this.y = y;
	}
	
	public String toString() { //object Ŭ������ toString()�� �������̵�
		return "x:"+ x + ", y:"+ y;
	}
}

public class Ex7_004 {

	public static void main(String[] args) {
		
//		Point3D p = new Point3D();
//		p.x = 3;
//		p.y = 5;  
		
		Point p = new Point(3, 5); //������ �̿��ؼ� �ڵ� ����ȭ
		
		//�پ��� ȣ�� ���
		System.out.println(p);
		System.out.println(p.toString());
		System.out.println("x:"+p.x);
		System.out.println("y:"+p.y);
	}
}
