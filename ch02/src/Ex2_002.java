/*
 * 날짜: 2021/05/04 
 * 내용: 자바의 정석_두 변수 값 교환(x,y값 교환)
 * 이름: 김하린
 */
public class Ex2_002 {

	public static void main(String[] args) {
		
		int x = 10, y = 20;
		int temp = 0;
		
		System.out.println("x:"+ x + " y:" + y);
		
		temp = x;
		x = y;
		y = temp;
		
		System.out.println("x:" + x + " y:" + y);
	}
}
