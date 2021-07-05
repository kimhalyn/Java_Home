/*
 * 날짜: 2021/05/18
 * 내용: 자바의 정석_Object클래스_hashCode()
 * 이름: 김하린
 * 객체의 해시코드(정수값)를 반환하는 메서드
 * 객체의 주소를 int로 변환해서 반환
 * equals()를 오버라이딩하면 hashCode()도 오버라이딩해야 함
 * identityHashCode(): 원래의 해시코드 값 반환(주소) 
 */

public class Ex9_003 {

	public static void main(String[] args) {

		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		
	}
}