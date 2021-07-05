import javax.swing.JOptionPane;

/*
 * 날짜: 2021/06/10
 * 내용: 자바의 정석_I/O블락킹
 * 이름: 김하린
 * I/O블락킹: 입출력 시 작업중단
 * */
public class Ex13_005 {

	public static void main(String[] args) {

//		싱글쓰레드
		String input = JOptionPane.showInputDialog("아무값이나 입력하세요");
		System.out.println("입력하신 값은 " + input + "입니다.");

		for (int i = 10; i > 0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000); // 1초간 시간 지연
			} catch (Exception e) {
			}
		}
		
//		멀티쓰레드
		ThreadEx5_1 th1 = new ThreadEx5_1();
		th1.start();

		String input1 = JOptionPane.showInputDialog("아무 값이나 입력하세요");
		System.out.println("입력하신 값은 " + input1 + "입니다.");
	}

}

class ThreadEx5_1 extends Thread {
	public void run() {
		for (int i = 10; i > 0; i--) {
			System.out.println(i);
			try {
				sleep(1000);
			} catch (Exception e) {
			}
		}
	}
}