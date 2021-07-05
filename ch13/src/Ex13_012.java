/*
 * 날짜: 2021/06/21
 * 내용: 자바의 정석_쓰레드의 동기화
 * 이름: 김하린
 * 쓰레드의 동기화 - 한 쓰레드가 진행중인 작업을 다른 쓰레드가 간섭하지 못하게 막는 것
 * 동기화하려면 간섭받지 않아야 하는 문장들을 '임계 영역'으로 설정
 * 임계영역은 락(lock)을 얻은 단 하나의 쓰레드만 출입 가능
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

	public synchronized void withdraw(int money) {//임계영역 설정
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
			int money = (int) (Math.random() * 3 + 1) * 100; //100, 200, 300 중 하나의 값을 임의로 출금
			acc.withdraw(money);
			System.out.println("balance: " + acc.getBalance());
		}
	}
}