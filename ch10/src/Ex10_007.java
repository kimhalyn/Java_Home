import java.util.Calendar;

/*
 * 날짜: 2021/05/27
 * 내용: 자바의 정석_날짜와 시간 & 형식화(add())
 * 이름: 김하린
 * Run Configuration
 */
public class Ex10_007 {

	public static void main(String[] args) {

//		if(args.length != 2) {
//			System.out.println("Usage : java CalrendarEx10_007 2021 5");
//			return;
//		}
		
		int year = Integer.parseInt(args[0]); //2021
		int month = Integer.parseInt(args[1]); //5
		
		int START_DAY_OF_WEEK = 0;
		int END_DAY = 0;
		
		Calendar sDAy = Calendar.getInstance(); //시작일
		Calendar eDAy = Calendar.getInstance(); //종료일
	
		sDAy.set(year, month-1, 1); //month가 0부터 시작하니까 5월 출력되려면 -> 4가 들어가야 함
		eDAy.set(year, month, 1);
		
		eDAy.add(Calendar.DATE, -1); //그 달의 마지막 날 출력
		
		// 첫 번째 요일이 무슨 요일인지 알아냄
		START_DAY_OF_WEEK = sDAy.get(Calendar.DAY_OF_WEEK); 
		END_DAY = eDAy.get(Calendar.DATE);
		
		System.out.println("      " + year + "년 "+ month +"월");
		System.out.println(" SU MO TU WE TH FR SA");
		
		//해당 월의 1일이 어느 요일인지에 따라 공백 출력
		for(int i=1; i < START_DAY_OF_WEEK; i++) {
			System.out.print("   ");
		}
		for(int i=1, n=START_DAY_OF_WEEK; i <= END_DAY; i++, n++) {
			System.out.print((i<10) ? "  "+ i : " "+ i); //삼항 연산식
			if(n%7==0) System.out.println(); //토요일이 될 때마다 줄바꿈
		}
	}
}
