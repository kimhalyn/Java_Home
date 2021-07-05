import java.util.Scanner;
/*
 * 날짜: 2021/05/06
 * 내용: 자바의 정석_조건문(switch문 중첩)
 * 이름: 김하린
 * break; 빼먹지 않게 주의!
 * */
public class Ex4_011 {

	public static void main(String[] args) {
	
	System.out.printf("당신의 주민번호를 입력하세요.(예시:011231-1111222)>");
		
		Scanner scanner = new Scanner(System.in);
		String regNo = scanner.nextLine(); //문자가 있어서 문자열로
		
		char gender = regNo.charAt(7); //입력받은 번호의 8번째 문자를 gender에 저장 charAt(index)
		
		switch(gender) {
		case '1': case '3':
			switch(gender) {
				case '1':
					System.out.println("당신은 2000년 이전에 출생한 남자입니다.");
					break;
				case '3':
					System.out.println("당신은 2000년 이후에 출생한 남자입니다.");
				}
				break;
		case '2': case '4':
			switch(gender) {
				 case '2':
					 System.out.println("당신은 2000년 이전에 출생한 여자입니다.");
					 break;
				 case '4':
					 System.out.println("당신은 2000년 이후에 출생한 여자입니다.");
					 break;
				 }
//				break;를 하지 않으므로 -> case '2': case '4':문에서 종료되지 않고 -> default문으로 이동	
			default:
				System.out.println("유효하지 않은 주민등록번호입니다.");
		}
				
		
		
	}
}
