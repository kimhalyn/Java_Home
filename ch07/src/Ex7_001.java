/*
 * 날짜: 2021/05/13
 * 내용: 자바의 정석_상속
 * 이름: 김하린
 * 기존의 클래스로 새로운 클래스를 작성(코드 재사용)
 * 두 클래스를 부모와 자식으로 관계 맺음
 * 자식 클래스 extends 부모 클래스
 * 자손은 조상의 모든 멤버를 상속받음(자손 멤버 수 >= 부모 멤버 수)
 * 자손의 변경은 조상에 영향 미치지 않음
 */
class Tv{
	boolean power;
	int channel;
	
	void power() 		{power = !power;}
	void channelUp() 	{++channel;}	
	void channelDown()	{--channel;}
}
class CaptionTv extends Tv{ 
	boolean caption; //캡션상태(on/off)
	void displayCaption(String text) {
		if(caption) { //캡션이 on(true)일 때만 화면에 출력 
			System.out.println(text);
		}
	}
}
public class Ex7_001 {

	public static void main(String[] args) {
		CaptionTv ctv = new CaptionTv();
		ctv.channel = 10;
		ctv.channelUp();
		System.out.println(ctv.channel);
		ctv.displayCaption("Hello, world");
		ctv.caption = true; //캡션 on
		ctv.displayCaption("HelloWorld");
	}
}
