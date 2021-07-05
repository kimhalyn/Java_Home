import java.util.Calendar;
import java.util.Date;

/*
 * 날짜: 2021/05/27
 * 내용: 자바의 정석_날짜와 시간 & 형식화(clear())
 * 이름: 김하린
 * clear(): Calendar객체의 모든 필드를 초기화
 */
public class Ex10_004 {

	public static void main(String[] args) {
		
	Calendar dt = Calendar.getInstance();
	System.out.println(new Date(dt.getTimeInMillis()));
	
	dt.clear(); //모든 필드 초기화
	System.out.println(new Date(dt.getTimeInMillis()));

//	특정 필드 초기화
//	dt.clear(Calendar.SECOND); 
//	dt.clear(Calendar.MINUTE);
//	dt.clear(Calendar.HOUR_OF_DAY);
//	dt.clear(Calendar.HOUR);
	
//	System.out.println(new Date(dt.getTimeInMillis()));
	
	
	}
}
