/*
 * 날짜: 2021/06/10
 * 내용: 자바의 정석_멀티쓰레드(쓰레드가 번갈아가면서 작업)
 * 이름: 김하린
 * 
 * */
public class Ex13_004 {
	static long startTime = 0;
	
	public static void main(String[] args) {

		ThreadEX3_1 th1 = new ThreadEX3_1();
		th1.start();
		startTime = System.currentTimeMillis();
		
		for (int i = 0; i < 300; i++) {
			System.out.printf("%s", new String("-"));
		}
		System.out.println("소요시간1:" + (System.currentTimeMillis() - startTime));
	}
}
class ThreadEX3_1 extends Thread{
	public void run() {
		for(int i=0; i<300; i++) {
			System.out.printf("%s", new String("|"));
		}
		System.out.println("소요시간2:"+ (System.currentTimeMillis()));
	}
}