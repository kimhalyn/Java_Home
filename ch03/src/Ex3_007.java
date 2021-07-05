/*
 * 날짜: 2021/05/05
 * 내용: 자바의 정석_사칙 연산자
 * 이름: 김하린
 * */
public class Ex3_007 {

	public static void main(String[] args) {
		byte a = 10;
		byte b = 30;
		
//		답이 300이 아닌 이유
//		int값(a*b)을 더 작은 byte로 형변환 하면서 자료 손실이 발생됨
		byte c = (byte)(a * b);
		System.out.println(c); 

//		자료 손실 없음
		int d = (int)(a * b);
		System.out.println(d);
		
	}
	
}
