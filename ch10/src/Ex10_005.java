import java.util.Calendar;

/*
 * 날짜: 2021/05/27
 * 내용: 자바의 정석_날짜와 시간 & 형식화(add())
 * 이름: 김하린
 * add():  특정 필드의 값을 증가 또는 감소(다른 필드에 영향 미침) 8월 31일 -> 9월 1일
 * roll(): 특정 필드의 값을 증가 또는 감소(다른 필드에 영향 x) 8월 31일 -> 8월 1일
 */
public class Ex10_005 {

	public static void main(String[] args) {
		
		Calendar date = Calendar.getInstance();
		date.set(2015, 7, 31); //2015. 8. 31
		System.out.println(toString(date));

		System.out.println("= 1일 후 =");
		date.add(Calendar.DATE, 1);
		System.out.println(toString(date));
		
		System.out.println("= 6달 전 =");
		date.add(Calendar.MONDAY, -6);
		System.out.println(toString(date));
		
		System.out.println("= 31일 후(roll) =");
		date.roll(Calendar.DATE, 31);
		System.out.println(toString(date));
		
		System.out.println("= 31일 후(add)");
		date.add(Calendar.DATE, 31);
		System.out.println(toString(date));
		
	}
	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR)+ "년 "+ (date.get(Calendar.MONDAY)+1)+ "월 "+ date.get(Calendar.DATE)+"월";
	}
}
