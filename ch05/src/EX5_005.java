/*
 * 날짜: 2021/05/07
 * 내용: 자바의 정석_배열의 활용(총합과 평균)
 * 이름: 김하린
 * */
public class EX5_005 {

	public static void main(String[] args) {
		
		int sum = 0;
		float average = 0f;
		
		int[] score = {100, 88, 100, 100, 90};
		
		for(int i=0; i<score.length; i++) {
			sum += score[i];
		}
		average = sum / (float)score.length; //float로 형변환
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + average);
	}
}
