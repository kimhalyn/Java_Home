import javax.swing.JOptionPane;

/*
 * ��¥: 2021/06/11
 * ����: �ڹ��� ����_interrupt()
 * �̸�: ���ϸ�
 * ������(WAITING)�� �����带 ������ ����(RUNNABLE)�� ����
 * void interrupt() -> �������� interrupted���¸� false���� true�� ����
 * boolean isInterrupted() -> �������� interrupted���¸� ��ȯ
 * static boolean interrupted() -> ���� �������� interrupted���¸� ��ȯ ��, false�� ����
 * */
public class Ex13_009 {

	public static void main(String[] args) {

		ThreadEx9_1 th1 = new ThreadEx9_1();
		th1.start();
		
		String input = JOptionPane.showInputDialog("�ƹ� ���̳� �Է��ϼ���.");
		System.out.println("�Է��Ͻ� ���� "+ input + "�Դϴ�.");
		th1.interrupt(); //interrupt()�� ȣ���ϸ� -> interrupted���°� true�� ��
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
		System.out.println("ī��Ʈ�� ����Ǿ����ϴ�.");
	}
}