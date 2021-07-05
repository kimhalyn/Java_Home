import javax.swing.JOptionPane;

/*
 * 날짜: 2021/06/11
 * 내용: 자바의 정석_interrupt()
 * 이름: 김하린
 * 대기상태(WAITING)의 쓰레드를 실행대기 상태(RUNNABLE)로 만듦
 * void interrupt() -> 쓰레드의 interrupted상태를 false에서 true로 변경
 * boolean isInterrupted() -> 쓰레드의 interrupted상태를 반환
 * static boolean interrupted() -> 현재 쓰레드의 interrupted상태를 반환 후, false로 변경
 * */
public class Ex13_009 {

	public static void main(String[] args) {

		ThreadEx9_1 th1 = new ThreadEx9_1();
		th1.start();
		
		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
		System.out.println("입력하신 값은 "+ input + "입니다.");
		th1.interrupt(); //interrupt()를 호출하면 -> interrupted상태가 true가 됨
		System.out.println("isInterrupted():"+ th1.isInterrupted()); //true
	}
}

class ThreadEx9_1 extends Thread {
	public void run() {
		int i = 10;

		while (i != 0 && !isInterrupted()) { //false
			System.out.println(i--);
			for (long x = 0; x < 2500000000L; x++);
		}
		System.out.println("카운트가 종료되었습니다.");
	}
}