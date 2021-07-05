/*
 * 날짜: 2021/05/17
 * 내용: 자바의 정석_메서드 예외선언(1)
 * 이름: 김하린
 * 예외 처리 방법 1)try-catch 2)예외 선언(=예외 떠넘기기) 3)은폐
 * void method() throws Exception1, Exception2, ....ExceptionN{메서드 내용}
 * void method() throws Exception{메서드 내용}
 */
class Ex8_008 {

	public static void main(String[] args) throws Exception{ //예외처리 x -> 떠넘김(JVM)
		method1(); //예외처리 x -> 떠넘김
	}
	static void method1() throws Exception{
		method2(); //예외처리 x -> 떠넘김
	}
	static void method2() throws Exception{
		throw new Exception(); //예외발생 -> 처리못하고 die -> 떠넘김
	}
}