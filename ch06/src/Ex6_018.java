/*
 * ��¥: 2021/05/10
 * ����: �ڹ��� ����_�Ű����� �ִ� ������
 * �̸�: ���ϸ�
 * �ν��Ͻ��� ������ ������ ȣ��Ǵ� '�ν��Ͻ� �ʱ�ȭ �޼���'
 * Ŭ������ ������ �̸��� ���ƾ� ��
 * ���ϰ��� ����(void �Ⱥ���)
 * ��� Ŭ������ �ݵ�� �����ڸ� ������ ��
 * �⺻ ������: �Ű������� ���� ������
 *           �Ű������� �ִ� ������
 */ 
class Car{
	String color;
	String gearType;
	int door;

	Car(){} // �⺻ ������
	
	Car(String c, String g, int d){ //�Ű����� �ִ� ������
		color = c;
		gearType = g;
		door = d;
	}
}

public class Ex6_018 {	
	public static void main(String[] args) {

		Car c1 = new Car();
		c1.color = "white";
		c1.gearType = "auto";
		c1.door = 4;
		
		Car c2 = new Car("red", "manual", 2);
		
		System.out.println("c1�� color ="+ c1.color +", gearType=" + c1.gearType +", door=" + c1.door);
		System.out.println("c2�� color ="+ c2.color +", gearType=" + c2.gearType +", door=" + c2.door);
				
		
	}
}
