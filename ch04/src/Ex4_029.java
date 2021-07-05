/*
 * 날짜: 2021/05/06
 * 내용: 자바의 정석_이름 붙은 반복문
 * 이름: 김하린
 * 반복문에 이름을 붙여서 하나 이상의 반복문을 벗어남
 * */
public class Ex4_029 {

	public static void main(String[] args) {
		
		loop1 : for(int i=2; i<=9; i++) {
					for(int j=1; j<=9; j++) {
						if(j==5)
//							break loop1;
							break;
							System.out.println(i+"*"+ j +"="+ i*j);
					}
					System.out.println();
		}
		
	}
}
