/*
 * 날짜: 2021/05/05
 * 내용: 자바의 정석_비교 연산자
 * 이름: 김하린
 * */
public class Ex3_022 {
	public static void main(String[] args) {
	
		float f   = 0.1f;
		double d  = 0.1;
		double d2 = (double)f;
		
		//%b: boolean 형식으로 출력
		System.out.printf("10.0 == 10.0f  %b%n", 10.0==10.0f); //정수형 오차 발생 x
		System.out.printf("0.1==0.1f  %b%n", 0.1==0.1f); //실수형은 오차가 발생
		System.out.printf("f =%19.17f%n", f);
		System.out.printf("d =%19.17f%n", d);
		System.out.printf("d2=%19.17f%n", d2);

		System.out.printf("d==f %b%n", d==f); 
		System.out.printf("d==d2  %b%n", d==d2);
		System.out.printf("d2==f  %b%n", d2==f);
		System.out.printf("(float)d==f  %b%n", (float)d==f);
		
	
	}
	
}
