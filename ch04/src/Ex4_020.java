/*
 * 날짜: 2021/05/06
 * 내용: 자바의 정석_반복문(while문)
 * 이름: 김하린
 * while(조건식): 조건식이 거짓이 될 때까지 반복
 * */
public class Ex4_020 {

	public static void main(String[] args) {
	
//		for문과 while문 비교
		for(int i=1; i<=5; i++) {
			System.out.print(i);
		}
		
		System.out.println();

		int j = 1;
		while(j<=5) {
			System.out.print(j);
			j++;
		}
		
		System.out.println();
		
//		while은 조건문 생략 불가
		int i =5;
		
		while(i--!=0) { // 후위형이므로 -> whle(i!=0), i--; Systme.out.println(i+ "") 순으로 진행
			System.out.println(i+" - I can do it.");
		}
		
	}
}
