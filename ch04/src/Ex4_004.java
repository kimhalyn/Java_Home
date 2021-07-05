import java.util.Scanner;

/*
 * 날짜: 2021/05/06
 * 내용: 자바의 정석_조건문(if-else if문)
 * 이름: 김하린
 * if-else if문: 여러 개의 조건식을 포함한 조건식
 * */
public class Ex4_004 {

	public static void main(String[] args) {
	
		int score  = 0; //점수를 저장하기 위한 변수
		char grade = ' '; //학점을 저장하기 위햔 변수, 공백으로 초기화
		
		System.out.printf("점수를 입력하세요.>");
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt(); //화면에 입력받은 숫자를 score에 저장

//		char grade = 'D'; grade를 D로 초기값하면 else문 없어도 됨(코드 간결화)
		if(score >= 90) {
			grade = 'A';
		} else if(score >= 80) {
			grade = 'B';
		} else if(score >= 70) {
			grade = 'C';
		} else {
			grade = 'D';
		}
		System.out.println("당신의 학점은 "+ grade +"입니다.");
		
		
	}
	
}
