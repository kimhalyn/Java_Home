/*
 * 날짜: 2021/05/06
 * 내용: 자바의 정석_조건문(switch문을 이용하여 임의의 정수 만들기)
 * 이름: 김하린
 * 0.0 <= Math.random() < 1.0 - 0.0과 1.0사이의 임의의 double값을 반환
 * */
public class Ex4_007 {

	public static void main(String[] args) {
	
//		Quiz1. 1~10사이의 난수를 20개 출력하시오.
		for(int i = 1; i <= 20; i++) {
//			System.out.println(Math.random()); 0.0 <= x < 1.0
//			System.out.println(Math.random()*10); 0.0 <= x < 10.0
//			System.out.println((int)(Math.random()*10)); 0 <= x < 10
//			System.out.println((int)(Math.random()*10)+1); //1 <= x < 11, 1~10사이 출력  
		}
		
//		Quiz2. -5~5사이의 난수를 20개 출력하시오.
		for(int i = 1; i <= 20; i++) {
			System.out.print((int)(Math.random()*11)-5); //(0<=x<11)-5 -> -5<=x<6
			
		}
	}
}
