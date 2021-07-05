/*
 * 날짜: 2021/06/10
 * 내용: 자바의 정석_싱글쓰레드(순서대로 진행)
 * 이름: 김하린
 * 
 * */
public class Ex13_003 {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();

		for (int i = 0; i < 300; i++) {
			System.out.printf("%s", new String("-"));
		}
		System.out.println("소요시간1:" + (System.currentTimeMillis() - startTime));

		for (int i = 0; i < 300; i++) {
			System.out.printf("%s", new String("|"));
		}
		System.out.println("소요시간2:" + (System.currentTimeMillis() - startTime));
	}
}