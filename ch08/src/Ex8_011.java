/*
 * 날짜: 2021/05/17
 * 내용: 자바의 정석_finally블럭(2)
 * 이름: 김하린
 * finally블럭 -> 예외 발생 여부에 관계없이 항상 수행되어야 하는 코드를 넣음
 */
public class Ex8_011 {

	public static void main(String[] args) {

		Ex8_011.method1();
		System.out.println("method1()의 수행을 마치고 main메서드로 돌아왔습니다");
	}

	static void method1() {
		try {
			System.out.println("method1()이 호출되었습니다");
			return; //실행 중인 메서드 종료
		} catch (Exception e) {
			e.printStackTrace();
			//return이 실행되어도 -> finally블럭이 실행되고 메서드 종료 이루어짐
		} finally {
			System.out.println("method1()의 finally블럭이 실행되었습니다"); 
		}
	}
}