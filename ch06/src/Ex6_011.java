/*
 * ��¥: 2021/05/10
 * ����: �ڹ��� ����_�⺻�� �Ű�����
 * �̸�: ���ϸ�
 * �⺻�� �Ű�����: ������ ���� �б⸸ ����(read only)
 * */ 
class Data{
	int x;
}

public class Ex6_011 {	
	public static void main(String[] args) {

		Data d = new Data();
		d.x = 10;
		System.out.println("main() 1: x = " + d.x);
		
		change(d.x);
		System.out.println("After change(d.x)");
		System.out.println("main() 2: x = " + d.x);
	}
	
//		change(d);
//		System.out.println("After change(d.x)");
//		System.out.println("main() : x = " + d.x);
//	
	static void change(int x) { //�⺻�� �Ű�����
		x = 1000;
		System.out.println("change() x = "+ x);
	}
	
//	static void change(d) {
//		d.x = 1000;
//		System.out.println("change() x = "+ x);
//	}
//	
}
