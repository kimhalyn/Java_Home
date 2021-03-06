/*
 * 날짜: 2021/05/17
 * 내용: 자바의 정석_프로그램 오류, 예외클래스 계층 구조
 * 이름: 김하린
 * 컴파일 에러: 구문체크, 번역, 최적화에 대한 에러
 * 런타임 에러: 실행 중 발생하는 에러
 * 1)에러 : 프로그램 코드에 의해 수습될 수 없는 심각한 오류
 * 2)예외 : 프로그램 코드에 의해 수습될 수 있는 다소 미약한 오류
 * 논리적 에러: 실행은 되지만, 의도와 다르게 동작
 * 
 * 예외 클래스 
 * 1)Exception클래스들: 사용자의 실수와 같은 외적 요인에 의해 발생 
 * 2)RuntimeException클래스들: 프로그래머의 실수로 발생
 */
public class Ex8_001 {

	public static void main(String[] args) {
		
//		system.out.println(); 컴파일 에러
		System.out.println(args[0]); //런타임 에러
	}
}
