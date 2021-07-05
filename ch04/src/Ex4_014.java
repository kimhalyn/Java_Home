/*
 * 날짜: 2021/05/06
 * 내용: 자바의 정석_반복문(for문)
 * 이름: 김하린
 * 조건을 만족하는 동안 블럭{}를 반복 -> 반복횟수를 알 때 적합
 * */
public class Ex4_014 {

	public static void main(String[] args) {
	
		for(int i=1, j=10; i<=10; i++, j--) {
			System.out.printf("%d \t %d%n", i, j); //\t:tab, %n:개행
		}
		
	}
}
