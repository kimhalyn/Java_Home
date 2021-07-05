/*
 * 날짜: 2021/05/05
 * 내용: 자바의 정석_사칙 연산자
 * 이름: 김하린
 * */
public class Ex3_009 {
	public static void main(String[] args) {
	
		long a = 1_000_000 * 1_000_000;
		long b = 1_000_000 * 1_000_000L;
		
		System.out.println("a: "+a); //int값 범위인 20억을 넘어가서 오버플로우 발생
		System.out.println("b: "+b);
	}
	
}
