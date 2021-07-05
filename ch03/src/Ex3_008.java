/*
 * 날짜: 2021/05/05
 * 내용: 자바의 정석_사칙 연산자
 * 이름: 김하린
 * int타입 최댓값  -> 2X10의 9승
 * */
public class Ex3_008 {
	public static void main(String[] args) {
	
		int a = 1_000_000;
		int b = 2_000_000;
		
		long c = a * b;  //int*int=int -> 값 손실 발생
		System.out.println(c);
		
		long d = (long)a * b; //a와 b 중 하나를 형변환하여 계산
		System.out.println(d);
	}
	
}
