/*
 * 날짜: 2021/05/10
 * 내용: 자바의 정석_메서드(반드시 클래스 안에 있어야 함)
 * 이름: 김하린
 * 메서드: 1)수행 문장들을 묶어놓은 것, 2)값(입력)을 받아서 처리하고, 결과를 반환(출력)
 * 메서드 장점: 중복코드제거, 관리용이, 재사용 가능, 프로그램 구조화
 * 메서드 작성: 반복적으로 수행되는 여러 문장을 메서드로 작성, 하나의 메서드는 하나의 기능만 수행하도록 설계
 * */

//(1)메서드 작성
class MyMath {
	long add(long a, long b) { // 매개변수 long a, long b
		long result = a + b;
		return result; // 반환값 존재(return)
	}

	long subtract(long a, long b) {
		return a - b;
	}

	long multiply(long a, long b) {
		return a * b;
	}

	double divide(double a, double b) {
		return a / b;
	}
}

public class Ex6_008 {
	public static void main(String[] args) {

//		메서드 영역 - 지역변수(a, b, result)
//		int add(int a, int b) { 메서드 선언부 (타입, 메서드 이름, 매개변수 선언(0~n개))
//			메서드 구현부
//			int result = a + b; 
//			return result; 출력값은 0~1개
//		}
//		int result = add(3, 5); add메서드를 호출하고 결과를 result 변수에 저장
//		print99danAll(); void print99danAll()을 호출, void 타입 -> 반환값이 없음

		MyMath mm = new MyMath(); // (2) 객체 생성
		// (3) 객체 사용
		long result1 = mm.add(5L, 3L); // add메서드 호출 -> 작업을 마치면 호출한 곳으로 돌아옴
		long result2 = mm.subtract(5L, 3L);
		long result3 = mm.multiply(5L, 3L);
		double result4 = mm.divide(5L, 3L);

		System.out.println("add(5L, 3L) = " + result1);
		System.out.println("subtract(5L, 3L) = " + result2);
		System.out.println("multiply(5L, 3L) = " + result3);
		System.out.println("divide(5L, 3L) = " + result4);

	}
}
