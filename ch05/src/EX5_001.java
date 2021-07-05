/*
 * 날짜: 2021/05/07
 * 내용: 자바의 정석_배열 선언과 생성
 * 이름: 김하린
 * */
public class EX5_001 {

	public static void main(String[] args) {
		
//		int[] score; 		//1. 배열 score를 선언(참조변수)
//		score = new int[5]; //2. 배열의 생성
		
		int[] score = new int[5]; //배열의 선언과 생성을 동시에, 기본값 0으로 초기화
		score[3] = 100;
		
		System.out.println("score[0]="+score[0]);
		System.out.println("score[1]="+score[1]);
		System.out.println("score[2]="+score[2]);
		System.out.println("score[3]="+score[3]);
		System.out.println("score[4]="+score[4]);
		
		int value = score[3];
		System.out.println("value="+value);
		
		
	}
}
