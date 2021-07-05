/*
 * 날짜: 2021/05/04 
 * 내용: 자바의 정석_문자 리터럴과 문자열 리터럴
 * 이름: 김하린
 */
public class Ex2_004 {

	public static void main(String[] args) {
		
		//문자 리터럴
		char ch = 'A'; //작은 따옴표에는 문자, 빈 문자 사용 불가(반드시 하나의 문자가 존재해야 함)
		int i = 'A';
		
		//문자열 리터럴
		String str1 = "";
		String str2 = "ABCD";
		String str3 = "1234";
		String str4 = str2 + str3;
		
		System.out.println(ch);
		System.out.println(i);
		System.out.println(str4);
		
		
		String name = "ja" + "va"; //문자열과 문자열의 결합
		String str = name + " " + 8.0;
		
		System.out.println(name);
		System.out.println(str);
		System.out.println(7 + " ");
		System.out.println(" " + 7);
		System.out.println(7 + "");
		System.out.println("" + 7);
		System.out.println("" + "");
		System.out.println(7 + 7 + "");
		System.out.println("" + 7 + 7); //빈 문자열 + 숫자 = 숫자가 문자열로 변환 왜? 문자열은 문자열하고만 결합 가능하기 때문
	}
}
