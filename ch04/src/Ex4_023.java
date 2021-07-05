/*
 * 날짜: 2021/05/06
 * 내용: 자바의 정석_반복문(while문)
 * 이름: 김하린
 * */
public class Ex4_023 {

	public static void main(String[] args) {

		int sum =0;
		int i = 0;
		
		while((sum+= ++i) <= 100) { //(sum = sum+ ++i) <= 100 
			System.out.printf("%d - %d%n", i, sum);
		}
			
	}
}
