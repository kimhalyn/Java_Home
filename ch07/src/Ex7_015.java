/*
 * 날짜: 2021/05/14
 * 내용: 자바의 정석_참조변수의 형변환(=Casting)(2)
 * 이름: 김하린
 * 실제 생성된 인스턴스가 무엇인지가 중요 -> 이에 따라 행변환 실행 에러가 발생할 수 있음
 * 객체의 멤버변수를 넘어서는 형변환이 발생하면 안됨
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

		//생성한 인스턴스에 따라 컴파일에는 에러가 없으나 실행 시 에러가 발생할 수 있음
		Car1 c = new Car1();
		FireEngine1 fe = (FireEngine1)c; //형변환 실행 시 에러 발생 -> java.lang.ClassCastException
		fe.water(); //컴파일은 가능
		
	}
} 
