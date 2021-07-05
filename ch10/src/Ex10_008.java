import java.util.Calendar;
import java.util.Date;

/*
 * 날짜: 2021/05/27
 * 내용: 자바의 정석_Date와 Calrendar간의 변환
 * 이름: 김하린
 */
public class Ex10_008 {

	public static void main(String[] args) {

//		1. Calrendar를 Date로 변환 -> getTimeInMillis()
		Calendar cal1 = Calendar.getInstance();
		Date d1 = new Date(cal1.getTimeInMillis());
		
//		2. Date를 Calrendar로 변환 -> setTime()	
		Date d2 = new Date();
		Calendar cal2 = Calendar.getInstance();
		cal2.setTime(d2);
		
	}
}
