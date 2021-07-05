/*
 * 날짜: 2021/05/14
 * 내용: 자바의 정석_캡슐화와 접근 제어자
 * 이름: 김하린
 * iv는 private -> 외부접근을 막음, 메서드는 public으로 설정
 * 메서드를 통해서 iv로 접근 -> 왜? 외부로부터 데이터를 보호하기 위해서 
 * 외부에서는 불필요하고, 내부적으로만 사용되는 부분을 감추기 위해서
 * 
 * 별도로 메서드 생성 alt + shift + M
 * 생성한 메서드 수정 alt + shift + R
 */
class Time1{
	private int hour; //0~23사이의 값을 가져야 함
	private int minute;
	private int second;
	
	//set메서드 -> 매개변수로 지정된 값을 검사하여 조건에 맞을 때만 멤버 변수 값 변경
	public void setHour(int hour) {
		if(isNotValidHour(hour)) return; //빠져나감
		 
		this.hour = hour;
	}
	//매개변수로 넘겨진 hour가 유효한지 알려주는 메서드
	private boolean isNotValidHour(int hour) {
		return hour < 0 || hour > 23;
	}
	//get메서드 -> 멤버변수 값 반환
	public int getHour() {return hour;}
}

public class Ex7_012 {

	public static void main(String[] args) {

		Time1 t = new Time1();
		t.setHour(21);//hour의 값을 21로 변경
		System.out.println(t.getHour());
		t.setHour(100);
		System.out.println(t.getHour());
		
	}
} 
