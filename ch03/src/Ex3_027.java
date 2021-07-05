/*
 * 날짜: 2021/05/05
 * 내용: 자바의 정석_논리 연산자
 * 이름: 김하린
 * */
public class Ex3_027 {
	public static void main(String[] args) {
	
		boolean b = true;
		char ch = 'C';
		
		System.out.printf("b=%b%n", b);
		System.out.printf("!b=%b%n", !b);
		System.out.printf("!!b=%b%n", !!b);
		System.out.printf("!!!b=%b%n", !!!b);
		System.out.println();
		
		//대문자 < 소문자
		System.out.printf("ch=%c%n", ch);
		System.out.printf("ch < 'a' || ch > 'z'=%b%n", ch < 'a' || ch > 'z');
		System.out.printf("!('a' <= ch && ch<= 'z') =%b%n", !('a'<= ch && ch<= 'z'));
		System.out.printf(" 'a' <=ch && ch<= 'z'=%b%n", 'a'<=ch && ch<= 'z');
	}
	
}
