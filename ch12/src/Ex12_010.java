/*
 * 날짜: 2021/06/02
 * 내용: 자바의 정석_표준애너테이션
 * 이름: 김하린
 * 애너테이션: 주석처럼 프로그래밍 언어에 영향을 미치진 않지만 유용한 정보를 제공
 * @Override: 오버라이딩을 올바르게 했는지 확인
 * @Deprecated: 앞으로 사용하지 않을 것을 권장할 때 표기
 * @FunctionalInterface: 함수형 인터페이스에 붙이면 컴파일러 체크, 하나의 추상 메서드만 가져야 함
 * @SuppressWarnings: 컴파일러 경고메시지가 나타나지 않게 함
 */
class Parent{
	void parentMethod() {}
}
class Child extends Parent {
	@Override
	@Deprecated
	void parentMethod() {} //조상 메서드 이름 잘못 작성 -> 컴파일 에러
}

@FunctionalInterface //함수형 인터페이스는 1개의 추상 메서드만 가지 수 있는데, 2개의 메서드를 가져서 에러 발생
interface Testable{ 
	void test(); //추상메서드
//	void check(); 추상메서드
}

class EX12_010{
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		Child c = new Child();
		c.parentMethod(); //Deprecated된 메서드 사용
	}
}
