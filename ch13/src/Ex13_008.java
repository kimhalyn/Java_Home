/*
 * 날짜: 2021/06/11
 * 내용: 자바의 정석_sleep()
 * 이름: 김하린
 * static 메서드 - 쓰레드 자기 자신한테만 동작
 * 1. sleep() 2. yield()
 * sleep(): 현재 쓰레드를 지정된 시간동안 멈추게 함, 누군가가 깨워야 일어나서 실행
 * static void sleep(long millis) 천분의 일초 단위
 * static void sleep(long mills, int nanos) 천분의 일초 + 나노초 
 * 예외처리를 필수로 해야함 (interruptedException이 발생하면 깨어남)
 * */
public class Ex13_008 {

	public static void main(String[] args) {

		ThreadEx13_1 th1 = new ThreadEx13_1();
		ThreadEx13_2 th2 = new ThreadEx13_2();

		th1.start();
		th2.start();

//		dealy(2*1000);
		try {
			Thread.sleep(2000); //main쓰레드를 2초동안 재워서 -> 마지막에 출력
		} catch (InterruptedException e) {
		}
		
		System.out.print("<<main>> 종료");
	} //main 종료

//	static void delay(long millis) { 별도의 메서드를 생성하여 실행할 수도 있음
//		try {
//			Thread.sleep(millis);
//		}catch (InterruptedException e) {
//		}
//	}
}

class ThreadEx13_1 extends Thread {
	public void run() {
		for (int i = 0; i < 300; i++) {
			System.out.print("-");
		}
		System.out.print("<<th1>> 종료");
	}
}

class ThreadEx13_2 extends Thread {
	public void run() {
		for (int i = 0; i < 300; i++) {
			System.out.print("|");
		}
		System.out.print("<<th2>> 종료");
	}
}