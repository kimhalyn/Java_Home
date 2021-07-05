/*
 * 날짜: 2021/05/14
 * 내용: 자바의 정석_참조변수와 인스턴스의 연결
 * 이름: 김하린
 * 조상 클래스 메서드를 자속 클래스에서 오버라이딩 -> 오버라이딩된 메서드(=자식 메서드) 호출
 * 하지만 멤버변수의 경우 참조변수 타입에 따라 달라짐
 */
class Beverage{
	int x = 100;
	void method() {
		System.out.println("조상 메서드");
	}
}
class Coffee extends Beverage{
	int x = 200;
	void method() {
		System.out.println("자식 메서드");
		System.out.println("x="+ x);
		System.out.println("super.x="+ super.x);
		System.out.println("this.x="+ this.x);
	}
}
public class Ex7_017 {

	public static void main(String[] args) {
		
		Beverage be = new Coffee();
		Coffee co = new Coffee();
		
		System.out.println("be.x ="+ be.x);
		be.method();
		System.out.println();
		System.out.println("co.x="+ co.x);
		co.method();
	}
} 
