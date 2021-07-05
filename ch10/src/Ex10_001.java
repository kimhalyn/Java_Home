import java.util.Calendar;

/*
 * 날짜: 2021/05/27
 * 내용: 자바의 정석_날짜와 시간 & 형식화(get()사용)
 * 이름: 김하린
 * get(): 필드 읽기
 * Calendar클래스는 추상클래스 -> getInstance()를 통해 객체구현
 * 
 * <Calendar에 정의된 필드-날짜>
 * WEEK_OF_YEAR: 1월1일부터 ~ 지금까지 몇 번째 주
 * WEEK_OF_MONTH: 그 달의 1일부터 몇 번째 주
 * MONTH: 0부터 시작되므로 -> +1 해야 함
 * DAY_OF_MONTH: 그 달의 몇 번째 일
 * DAY_OF_YEAR: 그 해의 몇 번째 일
 * DAY_OF_WEEK: 요일, 1:일요일로 시작
 * DAY_OF_WEEK_IN_MONTH: 그 달의 몇 번째 요일
 * 
 * <Calendar에 정의된 필드-시간>
 * HOUR: 시간(0~11)
 * HOUR_OF_DAY: 시간(0~23)
 * AM_PM: 오전/오후
 */
public class Ex10_001 {

	public static void main(String[] args) {
		
//		Calendar cal = new Carlendar(); 에러 -> 추상클래스는 인스턴스 생성 불가함
		Calendar today = Calendar.getInstance(); //현재 날짜와 시간으로 셋팅
		System.out.println("올해의 년도 :"+ today.get(Calendar.YEAR));
		System.out.println("월(0~11이므로 항상 +1) :"+today.get(Calendar.MONTH));
		System.out.println("이 해의 몇 째 주 :"+ today.get(Calendar.WEEK_OF_YEAR));
		System.out.println("이 달의 몇 째 주 :"+ today.get(Calendar.WEEK_OF_MONTH));
		
		//date와 day_of_month는 같음
		System.out.println("이 달의 몇 일: "+ today.get(Calendar.DATE));
		System.out.println("이 달의 몇 일: "+ today.get(Calendar.DAY_OF_MONTH));
		System.out.println("이 해의 몇 일: "+ today.get(Calendar.DAY_OF_YEAR));
		System.out.println("요일(1:일요일~) :"+ today.get(Calendar.DAY_OF_WEEK));
		System.out.println("이 달의 몇 째 요일: "+ today.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println("오전(0)/오후(1) :"+ today.get(Calendar.AM_PM));
		System.out.println("시간(0~11) :"+ today.get(Calendar.HOUR));
		System.out.println("시간(0~23) :"+ today.get(Calendar.HOUR_OF_DAY));
		System.out.println("분(0~59) :"+ today.get(Calendar.MINUTE));
		System.out.println("초(0~59) :"+ today.get(Calendar.SECOND));
		System.out.println("1000분의 1초(0~999): "+ today.get(Calendar.MILLISECOND));
		System.out.println("Timezone(-12~+12): "+ (today.get(Calendar.ZONE_OFFSET)/(60*60*1000)));
		System.out.println("이 달이 마지막 날: "+ today.getActualMaximum(Calendar.DATE));
	}
}
