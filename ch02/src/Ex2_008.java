import java.util.Scanner;

/*
 * 날짜: 2021/05/04
 * 내용: 자바의 정석_화면에서 입력받기-Scanner
 * 이름: 김하린
 * 
 * 숫자를 문자열로: 숫자 + ""
 * 문자열을 숫자로: Integer.parseInt()
 */
public class Ex2_008 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //Scanner클래스 객체 생성
		
//		int num1 = scanner.nextInt();
//		int num2 = scanner.nextInt();
//		System.out.println(num1);
//		System.out.println(num2);
		
		System.out.println("두자리 정수를 하나 입력해주세요.");
		
		String input = scanner.nextLine(); //입력받은 내용을 input에 저장
		int num = Integer.parseInt(input);//입력받은 문자열 input을 숫자로 변환
		
		System.out.println("입력내용 :"+input);
		System.out.printf("num=%d%n", num);
		
		
		
		
	}
}
