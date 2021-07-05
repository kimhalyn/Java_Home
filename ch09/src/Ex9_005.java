/*
 * 날짜: 2021/05/18
 * 내용: 자바의 정석_String클래스
 * 이름: 김하린
 * String클래스 -> 데이터(문자배열) + 메서드(문자열 관련)
 * 내용을 변경할 수 없는 클래스(immutable클래스)
 * 만약 내용을 자주 변경해야 한다면 -> StringBuffer사용
 * 
 * 문자열 리터럴: 프로그램 실행 시 -> 자동으로 생성
 * 빈 문자열(""): 내용이 없는 문자열, 크기가 0, 문자열 초기화에 사용
 * 
 * 문자열 초기화 String s = "";(빈 문자열)
 * 문자 초기화 char c = ' ';(공백)
 */
public class Ex9_005 {

	public static void main(String[] args) {

		String str1 = "abc";
		String str2 = "abc";

		System.out.println("String str1 = \"abc\";");
		System.out.println("String str2 = \"abc\";");

		System.out.println("str1 == str2 ? " + (str1 == str2));
		System.out.println("str1.equals(str2) ? " + str1.equals(str2));
		System.out.println();

		String str3 = new String("\"abc\"");
		String str4 = new String("\"abc\"");

		System.out.println("String str3 = new String(\"abc\");");
		System.out.println("String str4 = new String(\"abc\");");

		System.out.println("str3 == str4 ? " + (str3 == str4));
		System.out.println("str3.equals(str4) ? " + str3.equals(str4));
	}
}