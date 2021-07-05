/*
 * ��¥: 2021/05/13
 * ����: �ڹ��� ����_super() - ������ ������
 * �̸�: ���ϸ�
 */
class Points{
	int x;
	int y;
	
	Points(){} //�ذ��� 1)
	Points(int x, int y){ //������ -> ù �ٿ� ������ ȣ����ؼ� super();�� ������
//		super(); -> Object Ŭ����
		this.x = x;
		this.y = y;
	}
	String getLocation() {
		return "x :"+ x + ", y :"+ y;
	}
}

class Points3D extends Points{
	int z;
	
	Points3D(int x, int y, int z){
//		������ ��� super();�� �ڵ������ϸ� -> 
//		Points3D�� ������ Points()�� ȣ���ϰ� �� -> 
//		�ٵ� ���� �⺻ points()�����ڰ� ���� ��? -> 
//		points(int x, int y)�����ڰ� �־ �⺻ �����ڰ� �ڵ� ���� x
//		�ذ��� -> 1)points(){} �⺻ ������ ����� �ְų�, 2)super()������ ����ؼ� �ڵ� �ۼ�
//		this.x = x;
//		this.y = y;
		super(x, y); //�ذ��� 2)
		this.z = z;
	}
	String getLocation() { //�������̵�
		return "x :"+ x + ", y :"+ y +", z :"+ z;
	}
}
public class Ex7_007 {

	public static void main(String[] args) {
		Points3D p3 = new Points3D(1, 2, 3);
	
		System.out.println(p3.x);
	}
	
}
