/*
 * ��¥: 2021/05/13
 * ����: �ڹ��� ����_���� ����
 * �̸�: ���ϸ�
 * Ŭ������ ��������� �ٸ� Ŭ���� Ÿ���� ���������� ����
 * ���� ������ Ŭ������ �����, �� ���� �����ؼ� Ŭ������ ����(���⵵�� ���� �� ����) 
 * ��Ӱ���: A�� B�̴�.
 * ���԰���: A�� B�� ������ �ִ�.
 */
class MyPoint{
	int x;
	int y;
}

//class Circle extends MyPoint{ ���
//	int r;
//}

class Circle{ //����
	MyPoint p = new MyPoint(); //�������� �ʱ�ȭ 
	int r;
}

public class Ex7_002 {

	public static void main(String[] args) {

	Circle c = new Circle();
	
//	���
//	c.x = 1;
//	c.y = 2;
//	c.r = 3;
//	
//	System.out.println("c.x ="+ c.x);
//	System.out.println("c.y ="+ c.y);
//	System.out.println("c.r ="+ c.r);
//	

	//����
	c.p.x = 4;
	c.p.y = 5;
	c.r = 6;
	
	System.out.println("c.p.x = "+ c.p.x);
	System.out.println("c.p.y = "+ c.p.y);
	System.out.println("c.r ="+ c.r);
	}
}
