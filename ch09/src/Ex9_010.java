/*
 * 날짜: 2021/05/19
 * 내용: 자바의 정석_StringBuilder, Math클래스
 * 이름: 김하린
 * StringBuffer -> 동기화, 멀티쓰레드(동시에 여러개 작업)
 * StringBuilder -> 동기화 x, 싱글쓰레드(한번에 1개 작업)
 */
public class Ex9_010 {

	public static void main(String[] args) {

		double sum = 0;
		double sum1 = 0;
		double sum2 = 0;
		
		for(double d=1.5; d<=10.5; d++) {
			double d1 = Math.round(d);
			double d2 = Math.rint(d);
			
			System.out.printf("%4.1f %4.1f %4.1f%n", d, d1, d2);
			
			sum += d;
			sum1 += d1;
			sum2 += d2;
		}
		System.out.println("------------");
		System.out.printf("%4.1f %4.1f %4.1f%n", sum, sum1, sum2);
	}
}