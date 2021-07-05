/*
 * ��¥: 2021/06/21
 * ����: �ڹ��� ����_join()
 * �̸�: ���ϸ�
 * ������ �ð����� Ư�� �����尡 �۾��ϴ� ���� ��ٸ�
 * 
 * */
class Ex13_011 {
	static long startTime = 0;

	public static void main(String[] args) {
		ThreadEx19_1 th1 = new ThreadEx19_1();
		ThreadEx19_2 th2 = new ThreadEx19_2();
		th1.start();
		th2.start();
		startTime = System.currentTimeMillis();

		try {
			th1.join();
			th2.join();
		} catch (InterruptedException e) {
		}
		System.out.println("�ҿ�ð�:" + (System.currentTimeMillis() - startTime));
	}
}

class ThreadEx19_1 extends Thread {
	public void run() {
		for (int i = 0; i < 300; i++) {
			System.out.println(new String("-"));
		}
	}
}

class ThreadEx19_2 extends Thread {
	public void run() {
		for (int i = 0; i < 300; i++) {
			System.out.println("|");
		}
	}
}
