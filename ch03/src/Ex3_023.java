/*
 * 날짜: 2021/05/05
 * 내용: 자바의 정석_문자열 비교 연산자
 * 이름: 김하린
 * 문자열 비교에는 ==대신 equals()를 사용해야 함
 * '==': 문자열이 완전히 같은지 비교
 * equals(): 문자열 내용이 같은지 비교
 * 대소문자 구별하지 않고 비교하고 싶을 때 -> equalsIgnoreCase()
 * */
public class Ex3_023 {
	public static void main(String[] args) {
	
		String str1 = "abc";
		String str2 = new String("abc");
		
		System.out.printf("\"abc\"==\"abc\" ? %b%n", "abc"=="abc");
		System.out.printf(" str1==\"abc\" ? %b%n", str1=="abc");
		//내용은 같아도 서로 다른 객체라서 false, equals()는 내용으로 판단하므로 결과값이 정확
		System.out.printf(" str2==\"abc\" ? %b%n", str2=="abc");
		
		System.out.printf("str1.equals(\"abc\") ? %b%n", str1.equals("abc"));
		System.out.printf("str2.equals(\"abc\") ? %b%n", str2.equals("abc"));
		System.out.printf("str2.equals(\"ABC\") ? %b%n", str2.equals("ABC"));
		
		//대소문자 구별하지 않고 비교하고 싶을 때 -> equalsIgnoreCase()
		System.out.printf("str2.equalsIgnoreCase(\"ABC\") ? %b%n", str2.equalsIgnoreCase("ABC"));
	
	}
	
}
