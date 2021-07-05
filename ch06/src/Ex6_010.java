/*
 * 날짜: 2021/05/10
 * 내용: 자바의 정석_호출스택
 * 이름: 김하린
 * static: 객체 생성없이 메서드 호출
 * void: return값 생략 가능
 * */ 
public class Ex6_010 {	
	public static void main(String[] args) {

		System.out.println("main(String[] args) 시작");
		firstMethod();
		System.out.println("main(String[] args) 종료");
	}
	
	static void firstMethod() {
		System.out.println("firstMethod 시작");
		secondMethod();
		System.out.println("firstMethod 종료");
	}
	
	static void secondMethod() {
		System.out.println("secondMethod 시작");
		System.out.println("secondMethod 종료");
	}
}

