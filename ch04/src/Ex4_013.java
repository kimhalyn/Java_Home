/*
 * 날짜: 2021/05/06
 * 내용: 자바의 정석_반복문(for문)
 * 이름: 김하린
 * 조건을 만족하는 동안 블럭{}를 반복 -> 반복횟수를 알 때 적합
 * */
public class Ex4_013 {

	public static void main(String[] args) {
	
		int sum = 0;
		
		for(int i=1; i<=10; i++) {
			sum += i;
			System.out.printf("1부터 %2d까지의 합: %2d%n", i, sum);
		}
//		System.out.printf("최종 sum: %2d%n", sum);
	}
}
