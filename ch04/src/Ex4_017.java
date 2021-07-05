/*
 * 날짜: 2021/05/06
 * 내용: 자바의 정석_반복문(중첩 for문)
 * 이름: 김하린
 * for문 내에 또 다른 for문을 포함
 * */
public class Ex4_017 {

	public static void main(String[] args) {
	
		//별 만들기 (1)
		
		for(int i=1; i<=5; i++) {
			System.out.println("**********");
		}
		
		System.out.println();
		
		//별 만들기 (2)
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=10; j++) {
				System.out.print("*"); //가로 출력이라서 print로 출력
			}
			System.out.println();
		}
		
		System.out.println();
		
		//삼각형 만들기 (1)
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
