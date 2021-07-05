import java.text.DecimalFormat;

/*
 * 날짜: 2021/05/27
 * 내용: 자바의 정석_형식화 클래스(DecimalFormat)
 * 이름: 김하린
 * DecimalFormat
 * 숫자 -> 문자열: format
 * 문자열 -> 숫자: parse
 * 
 * parseInt, parseDouble, parseFloat ...등 -> 콤마(,) 못 읽음
 */
public class Ex10_009 {

	public static void main(String[] args) {

		DecimalFormat df = new DecimalFormat("#,###.##");
		DecimalFormat df2 = new DecimalFormat("#.###E0");
		
		try {
			Number num = df.parse("1,234,567.89"); //문자열 -> 숫자로 변환
			System.out.print("1,234,567.89" + " -> " );
			
			double d = num.doubleValue(); //double타입으로 변환
			System.out.print(d + " -> "); 
			
			System.out.print(df2.format(num)); //지수형식으로 변환
		} catch (Exception e) {

		}
	}
}
