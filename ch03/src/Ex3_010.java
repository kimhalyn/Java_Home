/*
 * 날짜: 2021/05/05
 * 내용: 자바의 정석_사칙 연산자
 * 이름: 김하린
 * */
public class Ex3_010 {
	public static void main(String[] args) {
	
		int a = 1_000_000;
		
		int result1 = a * a / a;
		int result2 = a / a * a;
		
		System.out.printf("%d * %d / %d = %d%n", a, a, a, result1); //오버플로우 발생
		System.out.printf("%d / %d * %d = %d%n", a, a, a, result2);
	}
	
}
