/*
 * 날짜: 2021/06/10
 * 내용: 자바의 정석_쓰레드 우선순위
 * 이름: 김하린
 * */
public class Ex13_006 {

	public static void main(String[] args) {

		ThreadEx6_1 th1 = new ThreadEx6_1();
		ThreadEx6_2 th2 = new ThreadEx6_2();

//		main메서드를 수행하는 쓰레드는 -> 우선순위가 자동적으로 5
		th2.setPriority(7);
		
		System.out.println("Priority of th1(-): "+ th1.getPriority());
		System.out.println("Priority of th2(|): "+ th2.getPriority());
		th1.start();
		th2.start();
	}
}

class ThreadEx6_1 extends Thread {
	public void run() {
		for (int i = 0; i < 300; i++) {
			System.out.print("-");
			for (int x = 0; x < 10000000; x++) //시간 지연용 for문
				;
		}
	}
}

class ThreadEx6_2 extends Thread {
	public void run() {
		for (int i = 0; i < 360; i++) {
			System.out.print("|");
			for (int x = 0; x < 10000000; x++)
				;
		}
	}
}