/*
 * 날짜: 2021/05/09
 * 내용: 자바의 정석_클래스 정의
 * 이름: 김하린
 * */
public class Ex6_005 {	

	public static void main(String[] args) {
		
		//비객체지향 코드
		int hour1, hour2, hour3;
		int minute1, minute2, minute3;
		int second1, second2, second3;
		
		int[] hour = new int[3];
		int[] minute = new int[3];
		int[] second = new int[3];
		
		//객체지향 코드
		class Time {
					int hour;
					int minute;
					int second;
		}
		Time t1 = new Time();
		Time t2 = new Time();
		Time t3 = new Time();
	
//		참조변수 배열 생성
		Time[] t = new Time[3];
//		객체 생성하여 배열에 저장
		t[0] = new Time();
		t[1] = new Time();
		t[2] = new Time();

	}
}
