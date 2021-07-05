/*
 * 날짜: 2021/05/15
 * 내용: 자바의 정석_내부 클래스의 제어자와 접근성(4)
 * 이름: 김하린
 */
class Outer{
	class instanceInner{
		int iv = 100;
	}
	static class staticInner{
		int iv = 200;
		static int cv = 300;
	}
	void myMethod() {
		class localInner{
			int iv = 400;
		}
	}
}
public class Ex7_030 {
	public static void main(String[] args) {
		
//		외부 클래스 생성 -> 인스턴스클래스의 인스턴스 생성
		Outer oc = new Outer();
		Outer.instanceInner ii = oc.new instanceInner();
		System.out.println("ii.iv : "+ ii.iv);
		
		//외부 클래스의 객체 생성 없이 사용 가능
		System.out.println("Outer.staticInner.cv : "+ Outer.staticInner.cv);
		
		//static 내부 클래스 인스턴스는 외부 클래스를 먼저 생성하지 않아도 됨
		Outer.staticInner si = new Outer.staticInner();
		System.out.println("si.iv : "+ si.iv);
	}
}
