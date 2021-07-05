/*
 * 날짜: 2021/05/15
 * 내용: 자바의 정석_내부 클래스의 제어자와 접근성(2)
 * 이름: 김하린
 */
class Ex7_028 {

	class InstanceInner{}
	static class StaticInner{}

	InstanceInner iv = new InstanceInner();
	static StaticInner cv = new StaticInner();
	
	static void stiaticMethod() {
//		InstanceInner obj1 = new InstanceInner(); 에러 -> static멤버는 인스턴스멤버에 직접 접근할 수 없음
		StaticInner obj2 = new StaticInner();
		
//		인스턴스 클래스는 외부 클래스를 먼저 생성하면 접근 가능
		Ex7_028 outer = new Ex7_028();
		InstanceInner obj1 = outer.new InstanceInner();
	}
	void instanceMethod() {
//		인스턴스메서드에서는 인스턴스멤버와 static멤버 모두 접근 가능
		InstanceInner obj1 = new InstanceInner();
		StaticInner obj2 = new StaticInner();
//		LocalInner lv = new LocalInner(); 에러 -> 메서드 내 지역적으로 선언 -> 외부에서 접근 x
	}
	void myMethod() {
		class LocalInner{}
		LocalInner lv = new LocalInner();
	}

}