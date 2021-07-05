/*
 * 날짜: 2021/05/05
 * 내용: 자바의 정석_논리 연산자
 * 이름: 김하린
 * 효율적인 연산: '||'의 경우, 왼쪽에 '참'일 확률이 높은 피연산자를 두는게 빠른 결과를 얻을 수 있음
 * */
public class Ex3_026 {
	public static void main(String[] args) {
	
		int a = 5;
		int b = 0;
		
		System.out.printf("a=%d, b=%d%n", a, b);
		System.out.printf("a!=0 || ++b!=0 = %b%n", a!=0 || ++b!=0);
		System.out.printf("a=%d, b=%d%n", a, b);
		System.out.printf("a==0 && ++b!=0 = %b%n", a==0 && ++b!=0);
		System.out.printf("a=%d, b=%d%n", a, b);
			
	
	}
	
}
