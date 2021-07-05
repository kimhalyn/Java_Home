import java.util.Scanner;

/*
 * 날짜: 2021/05/06
 * 내용: 자바의 정석_반복문(do-while문)
 * 이름: 김하린
 * while문의 조건식과 블럭{}의 순서를 바꾼 것, 반드시 1번은 실행됨
 * do{while 조건문이 참인 경우} while(조건문)
 * */
public class Ex4_024 {

	public static void main(String[] args) {

		int input = 0, answer = 0;
		
		answer = (int)(Math.random() * 100) + 1; //1~100사이의 임의의 수 저장
		
//		정답
		System.out.println("answer="+answer); 
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.printf("1과 100사이의 정수를 입력하세요.");
			input = scanner.nextInt();
			
			if(input > answer) {
				System.out.println("더 작은 수로 다시 시도해보세요.");
			}else if(input < answer) {
				System.out.println("더 큰 수로 다시 시도해보세요.");
			}
		}while(input!=answer); //do{}이 실행될 조건문
		
		System.out.println("정답입니다.");
	}
}
