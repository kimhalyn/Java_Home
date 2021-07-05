/*
 * 날짜: 2021/05/19
 * 내용: 자바의 정석_문자열을 숫자로 변환
 * 이름: 김하린
 */
public class Ex9_012 {

	public static void main(String[] args) {

		int i = Integer.parseInt("100");
		
		System.out.println("i="+Integer.parseInt("100"));
		System.out.println("i="+Integer.parseInt("100", 10)); //10진수
		System.out.println("i="+Integer.parseInt("100", 2));  //2진수
		System.out.println("i="+Integer.parseInt("FF", 16));  //16진수
		
		
	}
}