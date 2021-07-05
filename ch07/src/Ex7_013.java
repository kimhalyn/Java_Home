/*
 * 날짜: 2021/05/14
 * 내용: 자바의 정석_다형성
 * 이름: 김하린
 * 조상 타입 참조 변수로 자손 타입 객체를 다루는 것(반대는 불가)
 * 참조변수와 객체 타입이 일치할 때와 불일치할 때(다형성)의 차이점? -> 사용할 수 있는 멤버변수 개수가 달라짐
 */

class WideTv{
	boolean power;
	int channel;
	
	void power() {power = !power;}
	void channelUp() {++channel;}
	void channelDown() {--channel;}
}
class SmartTv extends WideTv{
	String text;
	void cation() {}
}
public class Ex7_013 {

	public static void main(String[] args) {
//		(1) 원래 참조변수 타입과 객체 타입이 일치할 때
//		WideTv w = new WideTv();
//		SmartTv s = new SmartTv();
		
		//(2) 다형성 사용하여 표현
		WideTv w = new SmartTv();
	}
} 
