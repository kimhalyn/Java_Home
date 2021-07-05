/*
 * 날짜: 2021/05/05
 * 내용: 자바의 정석_사칙 연산자
 * 이름: 김하린
 * 
 * 산술 변환: 연산 전에 피연산자 타입을 일치시키는 것
 * long + int = int
 * float + int = float
 * double + float = double
 * 
 * int보다 작은 타입(byte, char, short) -> int로 변환
 * */
public class Ex3_005 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 4;
		
		System.out.printf("%d + %d = %d%n", a, b, a + b);
		System.out.printf("%d - %d = %d%n", a, b, a - b);
		System.out.printf("%d * %d = %d%n", a, b, a * b);
		System.out.printf("%d / %d = %d%n", a, b, a / b); //같은 타입으로만 계산 가능 -> 2.5의 정수값인 2 반환
		System.out.printf("%d / %f = %f%n", a, (float)b, a / (float)b); //값손실이 적은 쪽으로 형변환
		
		
	}
	
}
