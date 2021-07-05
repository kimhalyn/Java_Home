import java.util.Scanner;

/*
 * 날짜: 2021/05/06
 * 내용: 자바의 정석_조건문(중첩 if문)
 * 이름: 김하린
 * 중첩 if문: if문 안에 if문
 * */
public class Ex4_005 {

	public static void main(String[] args) {
	
		int score = 0;
		char grade = ' ', opt = '0'; //opt 초기값을 0으로 설정
		
		System.out.printf("점수를 입력해주세요.>");
		
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt();
		
		System.out.printf("당신의 점수는 %d입니다.%n", score);
		
		if(score >= 90) {
			grade = 'A';
			if(score >= 98) {
				opt = '+';
			} else if(score < 94) {
				opt = '-';
			}
		} else if(score >= 80) {
			grade = 'B';
			if(score >=88) {
				opt = '+';
			} else if(score < 84) {
				opt = '-';
			}
		}else {
			grade = 'C';
		}
		System.out.printf("당신의 학점은 %c%c입니다.%n", grade, opt);
		
	}
	
}
