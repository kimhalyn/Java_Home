/*
 * ��¥: 2021/05/13
 * ����: �ڹ��� ����_super() - ������ ������
 * �̸�: ���ϸ�
 * ������ �����ڸ� ȣ���� �� ���
 * ������ ����� ���� �����ڸ� ȣ���ؼ� �ʱ�ȭ
 * ����!! ������ ù �ٿ� �ݵ�� �����ڸ� ȣ���ؾ� �� -> �ƴϸ� �����Ϸ��� super();�� �ڵ� ����
 */
class Point2{
	int x = 10;
	int y = 20;
	
	Point2(int x, int y){ //������ -> ù �ٿ� ������ ȣ����ؼ� super();�� ������
//		super(); -> Object Ŭ����
		this.x = x;
		this.y = y;
	}
}
class Point2_3D extends Point2{
	int z = 30;
	
	Point2_3D() {
		this(100, 200, 300); //Point2_3D(int x, int y, int z) ȣ��
	}
	Point2_3D(int x, int y, int z){
		super(x, y); //Point2(int x, int y) ȣ��
		this.z = z;
	}
}
public class Ex7_006 {

	public static void main(String[] args) {
		Child c = new Child();
		c.method();
	}
}
