/*
 * 날짜: 2021/05/07
 * 내용: 자바의 정석_2차원 배열(고정 배열)
 * 이름: 김하린
 * 테이블 형태의 데이터를 저장하기 위한 배열
 * */
public class EX5_016 {

	public static void main(String[] args) {

		int[][] score = {
				{100, 100, 100},
				{20, 20, 20},
				{30, 30, 30},
				{40, 40, 40}
		};
		
		int korTotal = 0, engTotal = 0, mathTotal = 0;
		
		System.out.println(" 번호  국어  영어  수학  총점  평균");
		System.out.println("=================================");
		
		
		
		for(int i=0; i<score.length; i++) { //score.length: 행
			int sum = 0; 
			float avg = 0.0f;
			
			korTotal += score[i][0];
			engTotal += score[i][1];
			mathTotal += score[i][2];
			System.out.printf("%3d", i+1); //번호 출력
			
			for(int j=0; j<score[i].length; j++) { //score[i].length: 열
				sum += score[i][j];
				System.out.printf("%5d", score[i][j]); //
			}
			
			avg = sum / (float)score[i].length; //score[i].length: 열
			System.out.printf("%5d %5.1f%n", sum, avg);
		}
		
		System.out.println("=================================");
		System.out.printf("총점: %3d %4d %4d%n", korTotal, engTotal, mathTotal);
	}
}
