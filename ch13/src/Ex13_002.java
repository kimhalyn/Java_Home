/*
 * 날짜: 2021/06/10
 * 내용: 자바의 정석_main쓰레드
 * 이름: 김하린
 * 사용자 쓰레드: main쓰레드
 * 데몬 쓰레드: main쓰레드의 보조역할
 * */
public class Ex13_002 {

	static long startTime = 0;

	public static void main(String[] args) {

		ThreadEx11_1 th1 = new ThreadEx11_1();
		ThreadEx11_2 th2 = new ThreadEx11_2();

		th1.start();
		th2.start();
		startTime = System.currentTimeMillis();

		try {
			th1.join(); //main쓰레드가 th1의 작업이 끝날 때까지 기다림
			th2.join(); //main쓰레드가 th2의 작업이 끝날 때까지 기다림
		} catch (InterruptedException e) {
		}
		System.out.print("소요시간:" + (System.currentTimeMillis() - startTime));
	}
}

class ThreadEx11_1 extends Thread {
	public void run() {
		for (int i = 0; i < 300; i++) {
			System.out.print(new String("-"));
		}
	}
}

class ThreadEx11_2 extends Thread {
	public void run() {
		for (int i = 0; i < 300; i++) {
			System.out.print(new String("|"));
		}
	}
}