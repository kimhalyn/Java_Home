import java.util.Scanner;
/*
 * 날짜: 2021/05/06
 * 내용: 자바의 정석_조건문(if문)
 * 이름: 김하린
 * 블럭{}을 이용하여 여러 문장을 하나로 묶을 수 있음
 * 다만, 블럭{} 뒤에는 문장의 끝을 의미하는 ';'를 붙이지 않음
 * */
public class Ex4_002 {

	public static void main(String[] args) {
		
		int input;
		System.out.printf("숫자를 하나 입력하세요.>");
		
		
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine(); //화면을 통해 입력받은 내용을 tmp에 저장
		input = Integer.parseInt(tmp); // 입력받은 tmp를 숫자로 변환
		
		if(input==0) {
			System.out.println("입력하신 숫자는 0입니다.");
		}
	
		//괄호없이 if문을 작성 -> 한 문장만 if문에 속함
		if(input!=0) 
			System.out.println("입력하신 숫자는 0이 아닙니다."); //if문에 속한 문장
			System.out.printf("입력하신 숫자는 %d입니다.", input); //if문 밖의 문장 -> 항상 출력됨 
		
	}
	
}
