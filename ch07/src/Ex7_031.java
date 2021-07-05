/*
 * 날짜: 2021/05/15
 * 내용: 자바의 정석_내부 클래스의 제어자와 접근성(5)
 * 이름: 김하린
 */
class Outer2{
		int value = 10; //Outer2.this.value
	
		class Inner{
		int value = 20; //this.value

		void Method() {
			int value = 30;
			System.out.println("value :"+ value);
			System.out.println("this.value :"+ this.value);
			System.out.println("Outer2.this.value :"+ Outer2.this.value);
		}
	}
}
public class Ex7_031 {
	public static void main(String[] args) {
		
		Outer2 outer2 = new Outer2();
		Outer2.Inner inner = outer2.new Inner();
		inner.Method();
	}
}
