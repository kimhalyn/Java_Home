/*
 * 날짜: 2021/05/09
 * 내용: 자바의 정석_객체지향 언어/생성/사용
 * 이름: 김하린
 * 객체지향 언어 = 프로그래밍 언어 + 객체지향 개념(규칙)
 * 객체지향 언어의 장점 - 코드의 재사용성, 코드 유지보수가 용이
 * 캡슐화/상속/다형성/추상성
 * */

		//1. 클래스 작성
class Tv1 {
		//TV 속성(멤버변수)
		String color; //null
		boolean power; //false
		int channel; //0
		//TV 기능(메서드)
		void power() {power = !power;}
		void channelUp() {++channel;}
		void channelDown() {--channel;}
	}

public class Ex6_001 {

	public static void main(String[] args) {
		
		//2. 객체의 생성
		Tv1 t; //참조변수 t생성
		t = new Tv1(); //Tv t = new Tv(); 새로운 Tv객체를 t변수에 저장
		
		//3. 객체의 사용
		t.channel = 7; //channel값을 7
		t.channelDown(); //메서드 호출
		System.out.println("현재 채널은 "+ t.channel + " 입니다.");
	}
}
