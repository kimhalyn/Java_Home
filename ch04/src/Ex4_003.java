import java.util.Scanner;
/*
 * 날짜: 2021/05/06
 * 내용: 자바의 정석_조건문(if-else문)
 * 이름: 김하린
 * if-else문: 두 개의 조건식을 포함 
 * */
public class Ex4_003 {

	public static void main(String[] args) {
	
		System.out.printf("숫자를 하나 입력하세요.>");
		
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt(); //화면을 통해 입력받은 숫자를 input에 저장
		
		
		if(input==0) {
			System.out.println("입력하신 숫자는 0입니다.");
		} else {
			System.out.println("입력하신 숫자는 0이 아닙니다.");
		}
		
	}
	
}
