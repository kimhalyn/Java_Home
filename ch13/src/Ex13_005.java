import javax.swing.JOptionPane;

/*
 * ��¥: 2021/06/10
 * ����: �ڹ��� ����_I/O���ŷ
 * �̸�: ���ϸ�
 * I/O���ŷ: ����� �� �۾��ߴ�
 * */
public class Ex13_005 {

	public static void main(String[] args) {

//		�̱۾�����
		String input = JOptionPane.showInputDialog("�ƹ����̳� �Է��ϼ���");
		System.out.println("�Է��Ͻ� ���� " + input + "�Դϴ�.");

		for (int i = 10; i > 0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000); // 1�ʰ� �ð� ����
			} catch (Exception e) {
			}
		}
		
//		��Ƽ������
		ThreadEx5_1 th1 = new ThreadEx5_1();
		th1.start();

		String input1 = JOptionPane.showInputDialog("�ƹ� ���̳� �Է��ϼ���");
		System.out.println("�Է��Ͻ� ���� " + input1 + "�Դϴ�.");
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