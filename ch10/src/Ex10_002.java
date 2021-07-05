import java.util.Calendar;

/*
 * 날짜: 2021/05/27
 * 내용: 자바의 정석_날짜와 시간 & 형식화(set()사용)
 * 이름: 김하린
 * set(): 필드 변경
 */
public class Ex10_002 {

	public static void main(String[] args) {

		final String[] DAY_OF_WEEK = { "", "일", "월", "화", "수", "목", "금", "토" };

		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();

		date1.set(2019, 3, 29);
		System.out.println("date1은 " + toString(date1) + DAY_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)] + "요일이고,");
		System.out.println("date2은 " + toString(date2) + DAY_OF_WEEK[date2.get(Calendar.DAY_OF_WEEK)] + "요일입니다.");

//		두 날짜간의 차이을 얻으려면, 천분의 일초 단위로 변환해야 함(getTimeInMillis())
		long difference = (date2.getTimeInMillis() - date1.getTimeInMillis()) / 1000;
		System.out.println("그 날(date1)부터 지금(date2)까지 " + difference + "초가 지났습니다.");
		System.out.println("일(day)로 계산하면 " + difference / (24 * 60 * 60) + "일입니다.");

	}

	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR) + "년 " + (date.get(Calendar.MONDAY) + 1) + "월 " + date.get(Calendar.DATE) + "일 ";
	}
}
