/*
 * 날짜: 2021/05/17
 * 내용: 자바의 정석_예외처리, try-catch(3)
 * 이름: 김하린
 * Exception이 선언된 catch블럭은 모든 예외를 처리함(최고조상이라서)
 * -> 따라서 가장 마지막 catch블럭에 선언되어야 함
 * 만약 예외에 해당하는 catch블럭이 없다면 -> 프로그램 비정상 종료
 */
public class Ex8_004 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0); //예외발생, 0으로 나눌 수 없음
			System.out.println(4);
		}catch(ArithmeticException ae) {
			if(ae instanceof ArithmeticException)
				System.out.println("true");
			System.out.println("ArithmeticException");
		}catch(Exception e) { //모든 예외의 최고 조상
			System.out.println("Exception");
		}//try-catch 종료
		System.out.println(6);
	}
}
