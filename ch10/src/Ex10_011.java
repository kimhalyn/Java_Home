import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
 * 날짜: 2021/05/27
 * 내용: 자바의 정석_형식화 클래스(SimpleDateFormat)
 * 이름: 김하린
 * 날짜와 시간을 다양한 형식으로 출력할 수 있게 해줌
 */
public class Ex10_011 {

	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();
		cal.set(2005, 9, 3); //2005/10/3
		
		Date d = cal.getTime(); //Calendar를 Date로 변환
		
		SimpleDateFormat sdf1, sdf2, sdf3, sdf4;
		sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		sdf2 = new SimpleDateFormat("yy-MM-dd E요일");
		sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); //H:시간(0~23)
		sdf4 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a"); //h:시간(0~12)
		
		System.out.println(sdf1.format(d));
		System.out.println(sdf2.format(d));
		System.out.println(sdf3.format(d));
		System.out.println(sdf4.format(d));
	}
}
