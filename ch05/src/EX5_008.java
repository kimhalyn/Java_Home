/*
 * 날짜: 2021/05/07
 * 내용: 자바의 정석_배열의 활용(섞기)
 * 이름: 김하린
 * */
public class EX5_008 {

	public static void main(String[] args) {

		int[] ball = new int[45];
		
		for(int i=0; i<ball.length; i++) {
			ball[i] = i+1;
		}
		int temp = 0;
		int j = 0;
		
		for(int i=0; i<6; i++) {
			j = (int)(Math.random() * 45);
			temp = ball[i];
			ball[i] = ball[j];
			ball[j] = temp;
		}
		for(int i=0; i<6; i++) {
			System.out.printf("ball[%d]=%d%n", i, ball[i]);
		}
				
	}
}
