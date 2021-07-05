/*
 * 날짜: 2021/05/05
 * 내용: 자바의 정석_사칙 연산자
 * 이름: 김하린
 * */
public class Ex3_012 {
	public static void main(String[] args) {
	
	char c1 = 'a'; //문자'a' 코드값 97이 저장
	char c2 = c1;
	char c3= ' '; //c3을 공백으로 초기화

	int i = c1 + 1;
	
	c3 = (char)(c1 + 1);
	c2++;
	c2++;
	
	System.out.println("i=" + i);
	System.out.println("c2=" + c2);
	System.out.println("c3=" + c3);
	
	}
	
}
