/*
 * 날짜: 2021/05/06
 * 내용: 자바의 정석_반복문(중첩 for문)
 * 이름: 김하린
 * for문 내에 또 다른 for문을 포함
 * */
public class Ex4_016 {

	public static void main(String[] args) {
	
		//구구단
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.println(i+"*"+j+"="+(i*j));
			}
			System.out.println();	
		}
		
		
		
	}
}
