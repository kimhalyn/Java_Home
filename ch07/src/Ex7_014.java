/*
 * 날짜: 2021/05/14
 * 내용: 자바의 정석_참조변수의 형변환(=Casting)(1)
 * 이름: 김하린
 * 참조변수의 형변환: 사용할 수 있는 멤버의 갯수를 조절하는 것
 * 조상, 자손 관계일 때만 참조변수 서로 형변환 가능
 * 기본형의 형변환: 값이 바뀜(float 3.6 -> int 3)
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
//		Ambulance a2 = (Ambulance)f; 에러 -> 형변환은 부모, 자식간에만 발생하기 때문
		
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = new FireEngine();
		
		fe.water();
		car = (Car)fe; //형변환 생략 가능 -> 멤버변수가 많은 타입이 적은 타입으로 변환할 때 위험 x
//		car.water(); 에러 -> car의 멤버변수로 water메서드 없음
		fe2 = (FireEngine)car; //형변환 생략 불가 -> 멤버변수가 적은 타입이 많은 타입으로 변환할 때 위험 o
		fe2.water();
	}
} 
