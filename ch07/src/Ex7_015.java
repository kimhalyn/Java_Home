/*
 * ��¥: 2021/05/14
 * ����: �ڹ��� ����_���������� ����ȯ(=Casting)(2)
 * �̸�: ���ϸ�
 * ���� ������ �ν��Ͻ��� ���������� �߿� -> �̿� ���� �ຯȯ ���� ������ �߻��� �� ����
 * ��ü�� ��������� �Ѿ�� ����ȯ�� �߻��ϸ� �ȵ�
 */
class Car1{
	String color;
	int door;
	
	void drive() {
		System.out.println("drive, Brrrr~");
	}
	void stop() {
		System.out.println("stop!!!");
	}
}
class FireEngine1 extends Car1{
	void water() {
		System.out.println("water!!!");
	}
}

public class Ex7_015 {

	public static void main(String[] args) {

		//������ �ν��Ͻ��� ���� �����Ͽ��� ������ ������ ���� �� ������ �߻��� �� ����
		Car1 c = new Car1();
		FireEngine1 fe = (FireEngine1)c; //����ȯ ���� �� ���� �߻� -> java.lang.ClassCastException
		fe.water(); //�������� ����
		
	}
} 
