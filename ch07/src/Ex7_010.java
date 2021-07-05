/*
 * 날짜: 2021/05/13
 * 내용: 자바의 정석_제어자
 * 이름: 김하린
 * 클래스, 클래스 멤버에 부가적인 의미 부여, 접근 제어자는 하나만 사용
 * 접근 제어자: public, private, (default), protected
 * 그 외: static(공통적인), final(마지막의), abstract, native, transient, synchronized, volatile, strictfp
 */
class Card{
	final int NUMBER;
	final String KIND;
	static int width = 100;
	static int height = 250;
	
	Card(String kind, int num){
		KIND = kind;
		NUMBER = num;
	}
	Card(){
		this("HEART", 1);
	}
	public String toString() {
		return KIND +" " +NUMBER;
	}
}
public class Ex7_010 {

	public static void main(String[] args) {
		
		 Card c = new Card("HEART", 10);
//		 c.NUMBER = 5; 에러, 왜? -> final 제어자 때문에 값 변경 불가
		 System.out.println(c.KIND);
		 System.out.println(c.NUMBER);
		 System.out.println(c); //system.out.println(c.toString());
		
	}
	
} 
