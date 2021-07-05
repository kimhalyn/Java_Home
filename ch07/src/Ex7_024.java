/*
 * 날짜: 2021/05/15
 * 내용: 자바의 정석_인터페이스의 장점(1)
 * 이름: 김하린
 * 두 대상(객체) 간의 연결, 대화, 소통을 돕는 '중간 역할'을 함(ex)자판기
 * 선언과 구현을 분리시킬 수 있음, 느슨한 결합(변경에 유리, 유연한 코드)
 */
class A{
	public void method(I i) {//인터페이스 I를 구현한 것들만 가능
		i.method();
	}
}
//B클래스의 선언과 구현을 분리
interface I{
	public void method();
}
class B implements I{
	public void method() {
		System.out.println("B클래스의 메서드");
	}
}
class C implements I{
	public void method() {
		System.out.println("C클래스의 메서드");
	}
}
public class Ex7_024 {

	public static void main(String[] args) {
		
		A a = new A();
		a.method(new B() ); //A가 B를 사용(의존), C
		a.method(new C());
	}
} 
