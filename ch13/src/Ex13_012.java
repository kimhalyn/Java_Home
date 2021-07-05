/*
 * ��¥: 2021/06/21
 * ����: �ڹ��� ����_�������� ����ȭ
 * �̸�: ���ϸ�
 * �������� ����ȭ - �� �����尡 �������� �۾��� �ٸ� �����尡 �������� ���ϰ� ���� ��
 * ����ȭ�Ϸ��� �������� �ʾƾ� �ϴ� ������� '�Ӱ� ����'���� ����
 * �Ӱ迵���� ��(lock)�� ���� �� �ϳ��� �����常 ���� ����
 * */
class Ex13_012 {
	public static void main(String[] args) {
		
		Runnable r = new RunnableEx21();
		new Thread(r).start();
		new Thread(r).start();
	}
}

class Account {
	private int balance = 1000;

	public int getBalance() {
		return balance;
	}

	public synchronized void withdraw(int money) {//�Ӱ迵�� ����
		if (balance >= money) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			balance -= money;
		}
	}
}

class RunnableEx21 implements Runnable {
	Account acc = new Account();

	public void run() {
		while (acc.getBalance() > 0) {
			int money = (int) (Math.random() * 3 + 1) * 100; //100, 200, 300 �� �ϳ��� ���� ���Ƿ� ���
			acc.withdraw(money);
			System.out.println("balance: " + acc.getBalance());
		}
	}
}