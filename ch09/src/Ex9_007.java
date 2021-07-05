/*
 * 날짜: 2021/05/19
 * 내용: 자바의 정석_문자열과 기본형 간의 변환
 * 이름: 김하린
 */
public class Ex9_007 {

	public static void main(String[] args) {

		//숫자를 문자열로 바꾸는 방법
		int i = 100;
		String str1 = i + "";
		String str2 = String.valueOf(i);
		
		double d = 200.0;
		String str3 = String.valueOf(d);
		
		double sum = Integer.parseInt(str1)+ Double.parseDouble(str3);
		double sum2 = Integer.valueOf(str1)+ Double.valueOf(str3);
		
		System.out.println(String.join("", str1,"+",str3,"=")+sum);
		System.out.println(str1 +"+"+ str3 +"="+ sum2);
		
	
		//문자열을 숫자로 바꾸는 방법
		int i1 = Integer.parseInt("100");
		int i2 = Integer.valueOf("100"); //int -> 기본형 변수
		Integer i3 = Integer.valueOf("100"); //Integer -> 참조형 변수
		
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
	}
}