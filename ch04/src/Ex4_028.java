import java.util.Scanner;

/*
 * 날짜: 2021/05/06
 * 내용: 자바의 정석_continue문(2)
 * 이름: 김하린
 * */
public class Ex4_028 {

	public static void main(String[] args) {

		int menu = 0;
		int num = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) { //무한 반복문
			System.out.println("(1) square");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			System.out.printf("원하는 메뉴(1~3)를 선택하세요. (종료:0)>");
			
			String tmp = scanner.nextLine();
			menu = Integer.parseInt(tmp);
			
			if(menu==0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}else if(!(1 <= menu && menu <= 3)) {
				System.out.println("메뉴를 잘못 선택하셨습니다.(종료는 0)");
				continue; //while문으로 이동
			}
			System.out.println("선택하신 메뉴는 "+ menu +"번입니다.");
		} //while문 종료
		System.out.println("break문 빠져나옴");
	}
}
