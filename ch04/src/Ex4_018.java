import java.util.Scanner;

/*
 * 날짜: 2021/05/06
 * 내용: 자바의 정석_반복문(중첩 for문)
 * 이름: 김하린
 * for문 내에 또 다른 for문을 포함
 * */
public class Ex4_018 {

	public static void main(String[] args) {
	
		//삼각형 만들기 (2)
		int num = 0;
		
		System.out.printf("*을 출력할 라인의 수를 입력하세요.>");
		
		
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine();
		
		num = Integer.parseInt(tmp);
		
		for(int i=0; i<num; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=1; i<=num; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("&");
			}
			System.out.println();
		}
		
	}
}
