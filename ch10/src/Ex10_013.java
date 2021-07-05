import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/*
 * 날짜: 2021/05/27
 * 내용: 자바의 정석_형식화 클래스(SimpleDateFormat)
 * 이름: 김하린
 * 날짜와 시간을 다양한 형식으로 출력할 수 있게 해줌
 */
public class Ex10_013 {

	public static void main(String[] args) {

		String pattern = "yyyy/MM/dd";
		DateFormat df = new SimpleDateFormat(pattern);
		Scanner s = new Scanner(System.in);

		Date inDate = null;
		
		System.out.println("날짜를 " + pattern + "의 형태로 입력해주세요.(입력 예:2015/12/31)");

		while (s.hasNextLine()) { //다음에 읽을 값이 있는지 확인
			try {
				inDate = df.parse(s.nextLine()); 
				break;
			} catch (Exception e) {
				System.out.println("날짜를 " + pattern + "의 형태로 다시 입력해주세요.(입력 예:2015/12/31");
			}
		}
		Calendar cal = Calendar.getInstance();
		cal.setTime(inDate);
		Calendar today = Calendar.getInstance();
		long day = (cal.getTimeInMillis() - today.getTimeInMillis()) / (60 * 60 * 1000);
		System.out.println("입력하신 날짜는 현재와 " + day + "시간 차이가 있습니다. ");
	}
}
