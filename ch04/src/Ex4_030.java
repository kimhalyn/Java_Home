import java.util.Scanner;

/*
 * 날짜: 2021/05/06
 * 내용: 자바의 정석_이름 붙은 반복문
 * 이름: 김하린
 * */
public class Ex4_030 {

	public static void main(String[] args) {

		int menu = 0;
		int num = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		outer:
		while(true) { //무한 반복문
			System.out.println("(1) square");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			System.out.printf("원하는 메뉴(1~3)를 선택하세요. (종료:0)>");
			
			String tmp = scanner.nextLine();
			menu = Integer.parseInt(tmp);
			
			if(menu==0) {
				break;
			}else if(!(1 <= menu && menu <= 3)) {
				System.out.println("메뉴를 잘못 선택하셨습니다.(종료는 0)");
				continue;
			}
			
			for(;;) { //무한 반복문
				System.out.print("계산할 값을 입력하세요. (계산 종료:0. 전체 종료:99)>");
				tmp = scanner.nextLine();
				num = Integer.parseInt(tmp);
				
				if(num==0)
					break; //for문 종료
				
				if(num==99)
					break outer; //전체 while문 종료
				
				switch(menu) {
					case 1:
						System.out.println("result= "+ num*num);
						break;
					case 2:
						System.out.println("result ="+ Math.sqrt(num));
						break;
					case 3:
						System.out.println("result= "+Math.log(num));
						break;
				}
			} //for(;;)
		} //while
		System.out.println("프로그램이 종료되었습니다.");
	}
}
