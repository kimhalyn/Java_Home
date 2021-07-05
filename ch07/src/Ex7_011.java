/*
 * 날짜: 2021/05/13
 * 내용: 자바의 정석_제어자
 * 이름: 김하린
 * abstract(추상의, 미완성의)
 * 추상 메서드: 선언부만 작성하고, 구현구는 작성하지 않은 메서드
 * 추상 클래스(미완성 설계도): 클래스 내에 추상 메서드가 선언되어 있음, 인스턴스 생성 불가
 * -> 상속받아서 완전한 클래스를 만든 후 객체 생성
 */
class Time{
	private int hour, minute, second;
	
	Time(int hour, int minute, int second){
		setHour(hour);
		setMinute(minute);
		setSecond(second);
	}
	
	public int getHour() {return hour;}
	public void setHour(int hour) {
		if(hour < 0 || hour > 23) return;
		this.hour = hour;
	}
	
	public int getMinute() {return minute;}
	public void setMinute(int minute) {
		if(minute < 0 || minute > 59) return;
		this.minute = minute;
	}
	
	public int getSecond() {return second;}
	public void setSecond(int second) {
		if(second < 0 || second > 59) return;
		this.second = second;
	}
	public String toStiString() {
		return hour + ":" + minute + ":" + second;
	}
}
public class Ex7_011 {

	public static void main(String[] args) {
		
		Time t = new Time(12, 35, 30);
		System.out.println(t.toStiString());
//		t.hour = 13; 에러남 -> hour 변수의 접근 제어자가 private이므로 접근할 수 없음
		t.setHour(t.getHour()+1);
		System.out.println(t.toStiString());
	}
} 
