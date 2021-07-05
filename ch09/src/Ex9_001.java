/*
 * 날짜: 2021/05/18
 * 내용: 자바의 정석_Object클래스_equals(Object obj)
 * 이름: 김하린
 * Object클래스:모든 클래스의 최고 조상, 11개의 메서드만 가지고 있음
 * clone(): 객체 복사
 * equals(): 객체 자신(this)과 주어진 객체(obj)를 비교(객체 주소를 비교), 같으면 true 다르면 false
 * toString(): 객체정보를 문자열로 반환
 */
class Value {
	int value;

	Value(int value) {
		this.value = value;
	}
//	Object의 equals()를 오버라이딩해서 주소가 아닌 value를 비교
//	public boolean equals(Object obj) {
////		참조변수의 형변환 전에 반드시 instanceof로 확인
//		if(!(obj instanceof Value)) return false;
//		
//		Value v = (Value)obj; //obj를 value로 형변환
//		
//		return this.value == v.value;
//	}
}

public class Ex9_001 {

	public static void main(String[] args) {

		Value v1 = new Value(10);
		Value v2 = new Value(10);

		if (v1.equals(v2)) { //객체 주소값 비교
			System.out.println("v1과 v2는 같습니다");
		} else {
			System.out.println("v1과 v2는 다릅니다");
		}
		
		v1 = v2;
		
		if (v1.equals(v2)) { //객체 주소값 비교
			System.out.println("v1과 v2는 같습니다");
		} else {
			System.out.println("v1과 v2는 다릅니다");
		}
	}

}
