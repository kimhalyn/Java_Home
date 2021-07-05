/*
 * 날짜: 2021/05/05
 * 내용: 자바의 정석_사칙 연산자
 * 이름: 김하린
 * */
public class Ex3_014 {
	public static void main(String[] args) {

	char c = 'a';
	for(int i=0; i<26; i++) { //블럭{}안의 문장을 26번 반복
		System.out.print(c++); //'a'부터 26개 문자 출력
	}
	System.out.println(); //개행
	
	c = 'A';
	for(int i=0; i<26; i++) { //블럭{}안의 문장을 26번 반복
		System.out.print(c++); //'A'부터 26개 문자 출력
	}
	System.out.println(); //개행
		
	c = '0';
	for(int i=0; i<10; i++) { //블럭{}안의 문장을 10번 반복
		System.out.print(c++); //'0'부터 10개 문자 출력
	}
	System.out.println(); //개행
	}
	
}
