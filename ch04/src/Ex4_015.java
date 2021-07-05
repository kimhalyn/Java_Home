/*
 * 날짜: 2021/05/06
 * 내용: 자바의 정석_반복문(for문)
 * 이름: 김하린
 * 조건을 만족하는 동안 블럭{}를 반복 -> 반복횟수를 알 때 적합
 * */
public class Ex4_015 {

	public static void main(String[] args) {
	
		System.out.println("i \t 2*i \t 2*i-1 \t i*i \t 11-i \t i%3 \t i/3");
		System.out.println("--------------------------------------------------------");
		
		for(int i=1; i<=10; i++) {
			System.out.printf("%3d \t %3d \t %3d \t %3d \t %3d \t %3d \t %3d%n", i, 2*i, 2*i-1, i*i, 11-i, i%3, i/3 );
		}
	}
}
