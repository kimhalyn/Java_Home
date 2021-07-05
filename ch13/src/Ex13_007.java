/*
 * 날짜: 2021/06/10
 * 내용: 자바의 정석_데몬 쓰레드
 * 이름: 김하린
 * 일반 쓰레드의 작업을 돕는 보조적인 역할
 * 일반 쓰레드가 종료되면 -> 데몬 쓰레드는 자동 종료됨 
 * */
public class Ex13_007 implements Runnable {
	static boolean autoSave = false;

	public static void main(String[] args) {
		Thread t = new Thread(new Ex13_007());
		t.setDaemon(true); //데몬 쓰레드로 지정
		t.start();

		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println(i);

			if (i == 5)
				autoSave = true;
		}
		System.out.println("프로그램을 종료합니다.");
	}

	public void run() {
		while (true) { //무한루프
			try {
				Thread.sleep(3 * 1000); //3초 마다
			} catch (InterruptedException e) {
			}
//			autoSave값이 true이면 autoSave()를 호출함
			if (autoSave) {
				autoSave();
			}
		}
	}

	public void autoSave() {
		System.out.println("작업파일이 자동저장 되었습니다.");
	}
}
