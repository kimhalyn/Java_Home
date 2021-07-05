/*
 * 날짜: 2021/05/07
 * 내용: 자바의 정석_2차원 배열(고정 배열)
 * 이름: 김하린
 * 테이블 형태의 데이터를 저장하기 위한 배열
 * */
public class EX5_015 {

	public static void main(String[] args) {

		int[][] score = {
				{100, 100, 100},
				{20, 20, 20},
				{30, 30, 30},
				{40, 40, 40}
		};
		
		int sum= 0;
		
		for(int i=0; i<score.length; i++) { //score.length: 몇 행?
			for(int j=0; j<score[i].length; j++) {
				System.out.printf("score[%d][%d]=%d%n", i, j, score[i][j]); //score[i].length: 몇 열?
		
				sum += score[i][j];
			}
		}
		System.out.println("sum="+ sum);
	}
}
