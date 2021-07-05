/*
 * 날짜: 2021/05/05
 * 내용: 자바의 정석_사칙 연산자
 * 이름: 김하린
 * 
 * 소문자>대문자(32차이)
 * 문자 a코드값 : (10진수로) 97
 * 문자 A코드값 : (10진수로) 65
 * 문자 0코드값 : (10진수로) 48
 * */
public class Ex3_015 {
	public static void main(String[] args) {
		
		char lowerCase = 'a';
		char upperCase = (char)(lowerCase - 32);
		System.out.println(upperCase);
	
	}
	
}
