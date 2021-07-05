/*
 * ��¥: 2021/06/11
 * ����: �ڹ��� ����_sleep()
 * �̸�: ���ϸ�
 * static �޼��� - ������ �ڱ� �ڽ����׸� ����
 * 1. sleep() 2. yield()
 * sleep(): ���� �����带 ������ �ð����� ���߰� ��, �������� ������ �Ͼ�� ����
 * static void sleep(long millis) õ���� ���� ����
 * static void sleep(long mills, int nanos) õ���� ���� + ������ 
 * ����ó���� �ʼ��� �ؾ��� (interruptedException�� �߻��ϸ� ���)
 * */
public class Ex13_008 {

	public static void main(String[] args) {

		ThreadEx13_1 th1 = new ThreadEx13_1();
		ThreadEx13_2 th2 = new ThreadEx13_2();

		th1.start();
		th2.start();

//		dealy(2*1000);
		try {
			Thread.sleep(2000); //main�����带 2�ʵ��� ����� -> �������� ���
		} catch (InterruptedException e) {
		}
		
		System.out.print("<<main>> ����");
	} //main ����

//	static void delay(long millis) { ������ �޼��带 �����Ͽ� ������ ���� ����
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
		System.out.print("<<th1>> ����");
	}
}

class ThreadEx13_2 extends Thread {
	public void run() {
		for (int i = 0; i < 300; i++) {
			System.out.print("|");
		}
		System.out.print("<<th2>> ����");
	}
}