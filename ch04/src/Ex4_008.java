import java.util.Scanner;
/*
 * 날짜: 2021/05/06
 * 내용: 자바의 정석_조건문(switch문을 이용하여 임의의 정수 만들기)
 * 이름: 김하린
 * 0.0 <= Math.random() < 1.0 - 0.0과 1.0사이의 임의의 double값을 반환
 * */
public class Ex4_008 {

	public static void main(String[] args) {
	
		System.out.printf("가위(1), 바위(2), 보(3) 중 하나를 입력하세요.>");
		
		Scanner scanner = new Scanner(System.in);
		int user = scanner.nextInt();
		int com = (int)(Math.random() * 3) + 1; //1,2,3 중 하나가 com에 저장됨
		
		System.out.println("당신은 "+ user +"입니다");
		System.out.println("컴은 "+ com +"입니다");
		
		switch(user-com) {
			case 2: case -1:
				System.out.println("당신이 졌습니다");
				break;
			case 1: case -2: 
				System.out.println("당신이 이겼습니다.");
				break;
			case 0:
				System.out.println("비겼습니다.");
				break; //사실 마지막 문장은 break를 사용할 필요 없음
		
		}
		
	}
}
