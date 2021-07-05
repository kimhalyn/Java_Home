/*
 * 날짜: 2021/05/15
 * 내용: 자바의 정석_내부 클래스의 제어자와 접근성(1)
 * 이름: 김하린
 */
public class Ex7_027 {

	class InstanceInner{
		int iv = 100;
//		static int cv = 100; 에러 -> static변수 선언 불가
		final static int CONST = 100;
	}
	static class StaticInner{
		int iv = 200;
		static int cv = 200; //static클래스만 static멤버(객체 생성없이 사용 가능)정의 가능
	}
	void myMethod() {
		class LocalInner{
			int iv = 300;
//			static int cv = 300; 에러 -> static변수 선언 불가
			final static int CONST = 300;
		}
			}
	public static void main(String[] args) {
		System.out.println(InstanceInner.CONST);
		System.out.println(StaticInner.cv); 
		
	}
} 
