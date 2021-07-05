/*
 * 날짜: 2021/05/04
 * 내용: 자바의 정석_형식화된 출력-printf()_실수값 출력
 * 이름: 김하린
 */
public class Ex2_007 {

	
	public static void main(String[] args) {
		
		String url = "www.codechobo.com";
		
		float f1 = .10f;
		float f2 = 1e1f;
		float f3 = 3.14e3f;
		double d = 1.23456789;
		
		System.out.printf("f1=%f, %e, %g%n", f1, f1, f1); //'%f' 일반적으로 사용, '%e' 지수형태로 출력, '%g' 값을 간략히 표현
		System.out.printf("f2=%f, %e, %g%n", f2, f2, f2);
		System.out.printf("f3=%f, %e, %g%n", f3, f3, f3);
		
		System.out.printf("d=%f%n", d); //f는 소수점 아래 6자리 출력, 7자리에서 반올림
		System.out.printf("d=%14.10f%n", d); //전체 14자리 중 소수점 10개
		
		System.out.printf("[12345678901234567890]%n");
		System.out.printf("[%s]%n", url); //'%s' 문자열
		System.out.printf("[%20s]%n", url); //전체 20자리, 우측 정렬
		System.out.printf("[%-20s]%n", url); //전체 20자리, 좌측 정렬
		System.out.printf("[%.8s]%n", url); //왼쪽에서 8글자만 출력
	}
}
