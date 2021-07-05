import java.util.Scanner;

/*
 * 날짜: 2021/05/06
 * 내용: 자바의 정석_조건문(switch문)
 * 이름: 김하린
 * switch문: 처리해야 하는 경우의 수가 많을 때 유용 
 * 제약조건이 존재함 - 조건식 결과는 정수 또는 문자열
 *              - case문의 값은 상수, 문자, 문자열 가능 (변수, 실수 불가)
 *              - case 중복 불가
 * */
public class Ex4_006 {

	public static void main(String[] args) {

		System.out.printf("현재 월을 입력하세요.>");

		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();

		switch (month) {
		case 3:
		case 4:
		case 5:
			System.out.println("현재 계절은 봄입니다.");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("현재 계절은 여름입니다.");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("현재 계절은 가을입니다.");
			break;
		default:
//			case 12: case 1: case 2:
			System.out.println("현재 계절은 겨울입니다.");
		}
//		switch문을 if문으로 작성
		if (month == 3 || month == 4 || month == 5) {
			System.out.println("현재는 봄입니다.");
		} else if (month == 6 || month == 7 || month == 8) {
			System.out.println("현재는 여름입니다.");
		} else if (month == 9 || month == 10 || month == 11) {
			System.out.println("현재는 가을입니다.");
		} else {
			System.out.println("현재는 겨울입니다.");
		}

	}
}
