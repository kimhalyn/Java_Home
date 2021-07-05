/*
 * ��¥: 2021/06/10
 * ����: �ڹ��� ����_���μ����� ������
 * �̸�: ���ϸ�
 * ���μ���: ���� ���� ���α׷�, �ڿ��� �����带 ���� (��)����
 * ������: ���μ��� ������ ���� �۾��� �����ϴ� ��, ��� ���μ����� �ּ� �ϳ��� �����带 ���� (��)�ϲ�
 * 
 * ������ ����
 * 1) ThreadŬ���� ��� -> public void run(){ThreadŬ������ run()�� �������̵�}
 * 2) Runnable�������̽� ���� -> public void run(){Runnable�������̽��� �߻�޼��� run()�� ����}
 * 
 * ������ ����
 * ������ ���� -> start()ȣ�� -> start()������� ȣ�� x -> OS�����ٷ��� ��������� ������
 * */
public class Ex13_001 {
	
	public static void main(String[] args) {
		
		ThreadEx1_1  t1 = new ThreadEx1_1();
		
		Runnable r = new ThreadEx1_2();
		Thread t2 = new Thread(r);
		
		t1.start();
		t2.start();
		
	}
}

class ThreadEx1_1 extends Thread{ //1. ThreadŬ���� ���
	public void run() { //�����尡 ������ �۾�
		for(int i=0; i<5; i++) {
			System.out.println(getName());
		}
	}
}

class ThreadEx1_2 implements Runnable{ //2. Runnable�������̽� ���
	public void run() { //�����尡 ������ �۾�
		for(int i=0; i<5; i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
}