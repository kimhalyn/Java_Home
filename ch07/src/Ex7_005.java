/*
 * 날짜: 2021/05/13
 * 내용: 자바의 정석_참조변수 super
 * 이름: 김하린
 * 객체 자신을 가리키는 참조변수, 인스턴스 메서드(생성자)내에만 존재, 조상멤버와 자신을 구분
 * cf)this 참조변수 -> iv와 lv의 구별에 사용
 */
class Parent{
	int x = 10; 
}
class Child extends Parent{
	int x =20;
	void method() {
		System.out.println("x="+ x); //가까운 쪽 실행
		System.out.println("this.x="+ this.x);
		System.out.println("super.x="+ super.x);
	}
}
public class Ex7_005 {

	public static void main(String[] args) {
		Child c = new Child();
		c.method();
	}
}
