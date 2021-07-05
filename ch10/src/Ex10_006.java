import java.util.Calendar;

/*
 * 날짜: 2021/05/27
 * 내용: 자바의 정석_날짜와 시간 & 형식화(add())
 * 이름: 김하린
 * add():  특정 필드의 값을 증가 또는 감소(다른 필드에 영향 미침) 8월 31일 -> 9월 1일
 * roll(): 특정 필드의 값을 증가 또는 감소(다른 필드에 영향 x) 8월 31일 -> 8월 1일
 */
public class Ex10_006 {

	public static void main(String[] args) {

		Calendar date = Calendar.getInstance();
		
		date.set(2015, 0, 31); //2015/1/31로 셋팅
		System.out.println(toString(date));
		
//		(예외) 일 필드가 말일 일 때, roll()로 월 필드를 변경하면 -> 그 때는 일 필드에도 영향 가능
		date.roll(Calendar.MONTH, 1);
		System.out.println(toString(date));
	
		date.add(Calendar.MONTH, 1);
		System.out.println(toString(date));
	}
	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR)+"년 "+ (date.get(Calendar.MONTH)+1)+"월 "+ date.get(Calendar.DATE)+"일";
	}
}
