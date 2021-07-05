/*
 * 날짜: 2021/05/17
 * 내용: 자바의 정석_예외 발생시키기
 * 이름: 김하린
 * 연산자 new -> 발생시키려는 예외 클래스 객체 만듦
 * 키워드 throw -> 예외 발생
 */
public class Ex8_006 {

	public static void main(String[] args) {
		
		try {
			Exception e = new Exception("고의로 발생시켰음");
			throw e;
			//throw new Exception("고의로 발생시켰음"); -> 한줄로 작성 가능
		}catch(Exception e) {
			System.out.println("에러 메시지: "+e.getMessage());
			e.printStackTrace();
		}//try-catch 종료
		System.out.println("프로그램이 정상 종료됨");
	}
}