/*
 * 날짜: 2021/05/05
 * 내용: 자바의 정석_사칙 연산자
 * 이름: 김하린
 * */
public class Ex3_006 {

	public static void main(String[] args) {
		
		byte a = 10;
		byte b = 20;
		
//		byte c = a + b; 컴파일 에러. "Type mismatch: cannot convert from int to byte" 
//		-> int형 자료를 더 작은 byte로 넣기 위해선 -> 강제로 형변환해야함
		byte c = (byte)(a+b);
		System.out.println(c);
		
		
	}
	
}
