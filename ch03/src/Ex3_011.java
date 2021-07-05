/*
 * 날짜: 2021/05/05
 * 내용: 자바의 정석_사칙 연산자
 * 이름: 김하린
 * 유니코드(문자를 부호없는 정수)
 * 문자 0 -> 48
 * 문자 A -> 65
 * 문자 a -> 97	
 * */
public class Ex3_011 {
	public static void main(String[] args) {
	char a = 'a';
	char d = 'd';
	char zero = '0';
	char two = '2';
	
	//''문자임을 표기하기 위해서 사용
	System.out.printf("'%c' - '%c' = %d%n", d, a, d - a); 
	System.out.printf("'%c' - '%c' = %d%n", two, zero, two - zero);
	System.out.printf("'%c'=%d%n", a, (int)a);
	System.out.printf("'%c'=%d%n", d, (int)d);
	System.out.printf("'%c'=%d%n", zero, (int)zero);
	System.out.printf("'%c'=%d%n", two, (int)two);
	}
	
}
