/*
 * ��¥: 2021/05/10
 * ����: �ڹ��� ����_������ this(), �������� this
 * �̸�: ���ϸ�
 * ������ this(): �����ڿ��� �ٸ� ������ ȣ���� �� Ŭ���� ��� ���, ù �ٿ����� ���
 * �������� this: �ν��Ͻ� �ڽ��� ����Ű�� ��������, �ν��Ͻ� �޼��忡�� ��� ����, ���������� �ν��Ͻ� ������ ������ �� ���
 * ������, �ν��Ͻ� �޼��� -> this ��� 
 * Ŭ���� �޼���(static) -> this ���x
 */ 
class Car2{ //�ν��Ͻ� ����
	String color; //this.color�� ��¥ �̸�, ���� this�� ������
	String gearType; 
	int door; 

	Car2(){
		this("white", "auto", 4);
	} 
	Car2(String color){ 
		this(color, "auto", 5);
	}
	Car2(String color, String gearType, int door){ //��������
		this.color = color; //�ν��Ͻ� ���� this.color = �������� color;
		this.gearType = gearType;
		this.door = door;
	}
}
public class Ex6_019 {	
	public static void main(String[] args) {

		Car2 c1 = new Car2();
		Car2 c2 = new Car2("blue");
		Car2 c3 = new Car2("orange", "manual", 2);
		
		System.out.println("c1�� color ="+ c1.color +", gearType=" + c1.gearType +", door=" + c1.door);
		System.out.println("c2�� color ="+ c2.color +", gearType=" + c2.gearType +", door=" + c2.door);
		System.out.println("c2�� color ="+ c3.color +", gearType=" + c3.gearType +", door=" + c3.door);
				
		
	}
}

class MyMath1{
	long a, b; // this.a, this.b (�ν��Ͻ� ����), this ���� ����
	
	MyMath1(int a, int b){ //��������
		this.a = a; //�ν��Ͻ� ���� this.a = �������� a; (iv�� lv�� �����ϱ� ���ؼ� this ���)
		this.b = b;
	}
	long add() { //�ν��Ͻ� �޼���
		return a+b; // return this.a + this.b;
	}
	static long add(long a, long b) {//Ŭ���� �޼���(��ü �������� ���, ���� ��ü ������ �ʿ��� �ν��Ͻ� ������ ���Ұ�)
		return a+b; //�������� 
	}
}