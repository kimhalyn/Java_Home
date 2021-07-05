/*
 * 날짜: 2021/05/14
 * 내용: 자바의 정석_instanceof 연산자
 * 이름: 김하린
 * 참조변수(리모콘)의 형변환 가능여부 확인에 사용, 가능하면 true 반환
 * instanceof는 자신과 조상에 있어 항상 true를 반환함(리모콘으로 이해)
 * 순서: 1) instanceof 연산자로 반드시!! 형변환 가능 유무 확인 2) 형변환 실행
 * 
 */
class Market{}
class Emart extends Market{}

public class Ex7_016 {

	public static void main(String[] args) {
		
		Emart e = new Emart();
		
		if(e instanceof Emart) {
			System.out.println("This is a Emart instance");
		}
		if(e instanceof Market) {
			System.out.println("This is a Market instance");
		}
		if(e instanceof Object) {
			System.out.println("This is a Object instance");
		}
	}
} 
