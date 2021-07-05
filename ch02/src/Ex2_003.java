/*
 * 날짜: 2021/05/04 
 * 내용: 자바의 정석_상수와 리터럴
 * 이름: 김하린
 * 변수: 하나의 값을 저장하기 위한 공간
 * 상수: 값을 한번만 저장, 변수 타입 앞에 final 붙임, 선언과 동시에 초기화
 * 리터럴: 값 그 자체를 의미
 */
public class Ex2_003 {
	public static void main(String[] args) {
		final int score = 100; //score은 상수, 100은 리터
		
		// score = 200; 불가 왜? score가 상수이므로
		System.out.println(score);
		
		//논리형
		boolean power = true;
		
		//정수형(기본 int)
		byte b = 127; //byte타입 변수 범위: -128~127
		int oct = 010; // 8진수 10, 10진수로 8
		int hex = 0x10; // 16진수 10, 10진수로 16
		
		long l = 1000_000_000;
		long ll = 10_000_000_000L; //int범위가 20억이라서 에러 발생, 뒤에 L붙여서 long타입임을 지정

		//실수형(기본 double)
		float f = 3.14f; //f 생략 불가
		double d = 3.14d; 
		double d2 = 3.14; //d 생략 가능
//		float d3 = 3.14; 에러발생 왜? float < double 이라서 3.14가 d3에 못 들어감
		
		System.out.println(power);
		System.out.println(oct);
		System.out.println(hex);
		System.out.println(10.);
		System.out.println(.10);
		System.out.println(10f);
		System.out.println(1e3); //e3:1000.0, e-3: 0.001
	
	}
}
