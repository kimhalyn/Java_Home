/*
 * 날짜: 2021/05/04 
 * 내용: 자바의 정석_형변환(Casting)
 * 이름: 김하린
 * */
public class Ex2_011 {

	public static void main(String[] args) {
		
		//변수 또는 상수의 타입을 다른 타입으로 변환 (타입)피연산자
		double d = 85.4;
		int score = (int)d; //실수형이 정수형으로 변환할 때 소수점 이하 버림(반올림 x)
		
		System.out.println("score:"+score);
		System.out.println("d:"+d);
		
	}
	
}
