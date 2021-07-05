/*
 * 날짜: 2021/05/07
 * 내용: 자바의 정석_배열의 길이
 * 이름: 김하린
 * 배열은 한번 생성하면 실행동안 그 길이를 바꿀 수 없음(상수)
 * */
public class EX5_002 {

	public static void main(String[] args) {
		
		//배열이름.length: 배열 길이 
		int[] arr = new int[5];
		int tmp = arr.length; 
		
		System.out.printf("tmp: "+ tmp);
		System.out.println();
		
//		int[] score = new int[6];
//		for(int i=0; i<6; i++) {배열을 변경할 때 마다 -> i<6 수정해야 함
//			System.out.println(score[i]);
//		}
		
		int[] score = new int[6];
		for(int i=0; i<score.length; i++) {
			System.out.println("score["+ i +"]=" +score[i]);
		}
		
	}
}
