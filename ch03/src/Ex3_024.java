/*
 * 날짜: 2021/05/05
 * 내용: 자바의 정석_논리 연산자
 * 이름: 김하린
 * and, or 연산자 우선순위: '&&' > '||'
 * 가독성 측면에서 0 < x && x < 9으로 작성하는 것이 더 좋음 
 * */
public class Ex3_024 {
	public static void main(String[] args) {
		//초기화
		int x = 0;
		char ch = ' ';
		
		x = 15;
		System.out.printf("x=%2d, 10 < x && x < 20 = %b%n", x, 10 < x && x <20); //%2d: 정수를 최대 2자리까지 출력
		
		x = 6;
		//printf에서 %문자 출력 -> %%로 표기
		//&&가 ||보다 우선순위 높음
		System.out.printf("x=%d, x%%2==0 || x%%3==0 && x%%6!=0 =%b%n", x, x%2==0 || x%3==0 && x%6!=0);
		System.out.printf("x=%2d, (x%%2==0 || x%%3==0) && x%%6!=0 =%b%n", x, (x%2==0 || x%3==0) && x%6!=0); 
		
		ch='1';
		System.out.printf("ch='%c', '0' <= ch && ch <= '9' =%b%n", ch, '0' <= ch && ch <= '9');

		ch='a';
		System.out.printf("ch='%c', 'a' <= ch && ch <= 'z' =%b%n", ch, 'a' <= ch && ch <= 'z');
		
		ch='A';
		System.out.printf("ch='%c', 'A' <= ch && ch <= 'Z' =%b%n", ch, 'A' <= ch && ch <= 'Z');

		ch='q';
		System.out.printf("ch='%c', ch=='q' || ch == 'Q' =%b%n", ch, ch=='q' || ch == 'Q');
			
	
	}
	
}
