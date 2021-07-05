import java.util.Arrays;

/*
 * 날짜: 2021/05/07
 * 내용: 자바의 정석_String배열
 * 이름: 김하린
 * */
public class EX5_011 {

	public static void main(String[] args) {

		String[] strArr = {"가위", "바위", "보"};
		System.out.println(Arrays.toString(strArr)); //[]문자열로 출력
		
		for(int i=0; i<strArr.length; i++) {
			int tmp = (int)(Math.random() * strArr.length);
			System.out.println(strArr[tmp]);
		}
	}
		
}
