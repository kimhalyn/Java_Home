/*
 * 날짜: 2021/05/04 
 * 내용: 자바의 정석_실수형간의 형변환(Casting)
 * 이름: 김하린
 * */
public class Ex2_013 {

	public static void main(String[] args) {

		float f = 9.1234567f;
		double d  = 9.1234567;
		double d2 = (double)f; //float f를 double로 형변환
		
		System.out.printf("f = %20.18f%n", f);
		System.out.printf("d = %20.18f%n", d);
		System.out.printf("d2 = %20.18f%n", d2);
	}
	
}
