/*
 * 날짜: 2021/05/10
 * 내용: 자바의 정석_생성자 this(), 참조변수 this
 * 이름: 김하린
 * 생성자 this(): 생성자에서 다른 생성자 호출할 때 클래스 대신 사용, 첫 줄에서만 사용
 * 참조변수 this: 인스턴스 자신을 가리키는 참조변수, 인스턴스 메서드에서 사용 가능, 지역변수와 인스턴스 변수를 구별할 때 사용
 * 생성자, 인스턴스 메서드 -> this 사용 
 * 클래스 메서드(static) -> this 사용x
 */ 
class Car2{ //인스턴스 변수
	String color; //this.color가 진짜 이름, 보통 this를 생략함
	String gearType; 
	int door; 

	Car2(){
		this("white", "auto", 4);
	} 
	Car2(String color){ 
		this(color, "auto", 5);
	}
	Car2(String color, String gearType, int door){ //지역변수
		this.color = color; //인스턴스 변수 this.color = 지역변수 color;
		this.gearType = gearType;
		this.door = door;
	}
}
public class Ex6_019 {	
	public static void main(String[] args) {

		Car2 c1 = new Car2();
		Car2 c2 = new Car2("blue");
		Car2 c3 = new Car2("orange", "manual", 2);
		
		System.out.println("c1의 color ="+ c1.color +", gearType=" + c1.gearType +", door=" + c1.door);
		System.out.println("c2의 color ="+ c2.color +", gearType=" + c2.gearType +", door=" + c2.door);
		System.out.println("c2의 color ="+ c3.color +", gearType=" + c3.gearType +", door=" + c3.door);
				
		
	}
}

class MyMath1{
	long a, b; // this.a, this.b (인스턴스 변수), this 생략 가능
	
	MyMath1(int a, int b){ //지역변수
		this.a = a; //인스턴스 변수 this.a = 지역변수 a; (iv와 lv를 구분하기 위해서 this 사용)
		this.b = b;
	}
	long add() { //인스턴스 메서드
		return a+b; // return this.a + this.b;
	}
	static long add(long a, long b) {//클래스 메서드(객체 생성없이 사용, 따라서 객체 생성이 필요한 인스턴스 변수는 사용불가)
		return a+b; //지역변수 
	}
}