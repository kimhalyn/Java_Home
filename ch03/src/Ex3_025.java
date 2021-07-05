import java.util.Scanner;

/*
 * 날짜: 2021/05/05
 * 내용: 자바의 정석_논리 연산자
 * 이름: 김하린
 * */
public class Ex3_025 {
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		char ch = ' ';
		
		System.out.printf("문자를 하나 입력하세요.");
		
		String input = scanner.nextLine(); //문자열로 받기
		ch = input.charAt(0); //문자열에서 지정된 위치의 문자 하나를 가져오는 메서드
		
		if('0' <= ch && ch <= '9') {
			System.out.printf("입력하신 문자는 숫자입니다.%n");
		}

		if(('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z')) {
			System.out.printf("입력하신 문자는 영문자입니다.%n");
		}
	}
}
