/*
 * ��¥: 2021/05/14
 * ����: �ڹ��� ����_���������� ����ȯ(=Casting)(1)
 * �̸�: ���ϸ�
 * ���������� ����ȯ: ����� �� �ִ� ����� ������ �����ϴ� ��
 * ����, �ڼ� ������ ���� �������� ���� ����ȯ ����
 * �⺻���� ����ȯ: ���� �ٲ�(float 3.6 -> int 3)
 */
class Car{
	String color;
	int door;
	
	void drive() {
		System.out.println("drive, Brrrr~");
	}
	void stop() {
		System.out.println("stop!!!");
	}
}
class FireEngine extends Car{
	void water() {
		System.out.println("water!!!");
	}
}
class Ambulance extends Car{
	void siren() {
		System.out.println("siren~");
	}
}

public class Ex7_014 {

	public static void main(String[] args) {

//		FireEngine f = new FireEngine();
//		Car c = (Car)f;
//		FireEngine f2 = (FireEngine)c; 
//		Ambulance a = (Ambulance)c;
//		Ambulance a2 = (Ambulance)f; ���� -> ����ȯ�� �θ�, �ڽİ����� �߻��ϱ� ����
		
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = new FireEngine();
		
		fe.water();
		car = (Car)fe; //����ȯ ���� ���� -> ��������� ���� Ÿ���� ���� Ÿ������ ��ȯ�� �� ���� x
//		car.water(); ���� -> car�� ��������� water�޼��� ����
		fe2 = (FireEngine)car; //����ȯ ���� �Ұ� -> ��������� ���� Ÿ���� ���� Ÿ������ ��ȯ�� �� ���� o
		fe2.water();
	}
} 
