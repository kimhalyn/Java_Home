/*
 * 날짜: 2021/05/17
 * 내용: 자바의 정석_사용자 정의 예외 만들기, 예외 되던지기
 * 이름: 김하린
 * 사용자 정의 예외: 조상을 Exception과 RuntimeException중에서 선택, String을 매개변수로 받는 생성자
 * 예외 되던지기: 예외를 처리했는데 다시 예외를 발생시키는 것, 호출한 메서드와 호출된 메서드 양쪽 모두에서 예외 처리
 */
public class Ex8_012 {

	public static void main(String[] args) {
		
		try{
			method1();
		}catch(Exception e) {
			System.out.println("main메서드에서 예외가 처리되었습니다");
		}
	}
		static void method1() throws Exception{
		try {
			throw new Exception();
		}catch(Exception e) {
			System.out.println("method1메서드에서 예외가 처리되었습니다");
			throw e;
		}
	}
}
