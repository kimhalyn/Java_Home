/*
 * 날짜: 2021/05/06
 * 내용: 자바의 정석_반복문(중첩 for문)
 * 이름: 김하린
 * for문 내에 또 다른 for문을 포함
 * */
public class Ex4_019 {

	public static void main(String[] args) {
	
		for(int i=1; i<=3; i++) {
			for(int j=1; j<=3; j++) {
				for(int k=1; k<=3; k++) {
					System.out.println(""+i+j+k); //""+숫자 = ""(문자열)
				}
			}
		}
		System.out.println();
		
		for(int a=1; a<=5; a++) {
			for(int b=1; b<=4; b++) {
				System.out.printf("[%d, %d]", a, b);
			}
			System.out.println();
		}
		System.out.println();
		
		for(int a=1; a<=5; a++) {
			for(int b=1; b<=5; b++) {
				if(a==b) {
					System.out.printf("[%d, %d]", a, b);
				}else {
					System.out.printf("%6c", ' '); //공백 문자열
				}
			}
			System.out.println();
			
		}
		
	}
}
