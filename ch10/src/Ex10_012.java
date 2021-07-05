import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
 * 날짜: 2021/05/27
 * 내용: 자바의 정석_형식화 클래스(SimpleDateFormat)
 * 이름: 김하린
 * 날짜와 시간을 다양한 형식으로 출력할 수 있게 해줌
 */
public class Ex10_012 {

	public static void main(String[] args) {

		DateFormat df = new SimpleDateFormat("yyyy년 MM월 dd일");
		DateFormat df2 = new SimpleDateFormat("yyyy/MM/dd");
		
		try {
			Date d = df.parse("2015년 11월 23일"); //문자열 -> 날짜로 변환
			System.out.println(df2.format(d)); //날짜 -> 문자열로 변환
		}catch (Exception e) {}
	}
}
