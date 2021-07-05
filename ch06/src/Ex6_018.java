/*
 * 날짜: 2021/05/10
 * 내용: 자바의 정석_매개변수 있는 생성자
 * 이름: 김하린
 * 인스턴스가 생성될 때마다 호출되는 '인스턴스 초기화 메서드'
 * 클래스와 생성자 이름이 같아야 함
 * 리턴값이 없음(void 안붙임)
 * 모든 클래스는 반드시 생성자를 가져야 함
 * 기본 생성자: 매개변수가 없는 생성자
 *           매개변수가 있는 생성자
 */ 
class Car{
	String color;
	String gearType;
	int door;

	Car(){} // 기본 생성자
	
	Car(String c, String g, int d){ //매개변수 있는 생성자
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
		
		System.out.println("c1의 color ="+ c1.color +", gearType=" + c1.gearType +", door=" + c1.door);
		System.out.println("c2의 color ="+ c2.color +", gearType=" + c2.gearType +", door=" + c2.door);
				
		
	}
}
