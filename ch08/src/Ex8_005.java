/*
 * 날짜: 2021/05/17
 * 내용: 자바의 정석_printStackTrace()와 getMessage()
 * 이름: 김하린
 * printStackTrace(): 호출스택에 있는 정보를 화면에 출력
 * getMessage(): 예외클래스 인스턴스에 저장된 메시지
 */
public class Ex8_005 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0); //예외발생, 0으로 나눌 수 없음
			System.out.println(4);
		}catch(ArithmeticException ae) {
			ae.printStackTrace();
			System.out.println("예외 메시지: "+ae.getMessage() );
		}//try-catch 종료
		System.out.println(6);
	}
}