/*
 * 날짜: 2021/05/17
 * 내용: 자바의 정석_예외처리, try-catch(2)
 * 이름: 김하린
 */
public class Ex8_003 {

	public static void main(String[] args) {
		System.out.println(1);
		try {
			System.out.println(0/0); //예외발생, 0으로 나눌 수 없음
			System.out.println(2);
		}catch(ArithmeticException ae) {
			System.out.println(3);
		}//try-catch 종료
		System.out.println(4);
	}
}
