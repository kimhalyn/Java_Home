/*
 * 날짜: 2021/05/15
 * 내용: 자바의 정석_내부 클래스
 * 이름: 김하린
 * 클래스 안에 클래스
 * 장점: 내부 클래스에서 외부 클래스 멤버에 쉽게 접근할 수 있음, 코드의 복잡성을 줄일 수 있음(캡슐화)
 */
class AAA{ //class AAA -> class BBB의 외부 클래스 
	int i = 100;
	BBB b = new BBB();
	
	//class BBB -> class AAA의 내부 클래스
	class BBB{
		void method() {
//			AAA a = new AAA();
//			System.out.println("i: "+ a.i);
			System.out.println(i); //객체 생성없이 외부 클래스 멤버변수에 접근 가능
		}
	}
}
class CCC{
//	BBB b = new BBB(); 에러 -> class BBB가 class AAA의 내부에서만 사용되기 때문
}

public class Ex7_026 {

	public static void main(String[] args) {
//		class BBB가 AAA의 내부 클래스가 되었기 때문에 -> 먼저 AAA에 대한 객체를 생성한 뒤 사용 가능
//		BBB b = new BBB();
//		b.method();
	}
} 
