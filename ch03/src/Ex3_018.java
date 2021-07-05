/*
 * 날짜: 2021/05/05
 * 내용: 자바의 정석_사칙 연산자
 * 이름: 김하린
 * */
public class Ex3_018 {
	public static void main(String[] args) {
	
		//Math.round() 실수를 소수 첫 째자리에서 반올림 
		double pi = 3.141592;
		double shortPi = Math.round(pi * 1000) / 1000.0; //int / double=double
		
		System.out.println(shortPi);
		
		//3.141을 얻으려면?
		System.out.println((int)(pi*1000)/1000.0);
		
		
	
	}
	
}
