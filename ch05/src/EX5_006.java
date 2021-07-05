/*
 * 날짜: 2021/05/07
 * 내용: 자바의 정석_배열의 활용(최댓값, 최솟값)
 * 이름: 김하린
 * */
public class EX5_006 {

	public static void main(String[] args) {

		int[] score = {79, 88, 91, 33, 100, 55, 95};
		
		int max = score[0]; //초기화
		int min = score[0]; //초기화
		
		for(int i=1; i<score.length; i++) { //score[1]부터 max, min과 비교
			if(score[i] > max) {
				max = score[i];
			} else if(score[i] < min) {
				min = score[i];
			}
		}
		System.out.println("최댓값 : "+ max);
		System.out.println("최솟값 : "+ min);
	}
}
