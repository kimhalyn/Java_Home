import java.util.ArrayList;

/*
 * 날짜: 2021/06/21
 * 내용: 자바의 정석_wait(), notify()
 * 이름: 김하린
 * 동기화의 효율을 위해 생성
 * wait(): 객체의 lock을 풀고 쓰레드를 해당 객체의 waiting pool에 넣음
 * notify(): waiting pool에서 대기 중인 쓰레드 중의 하나를 깨움(순서 상관없이 아무거나 깨움)
 * notifyAll(): waiting pool에 대기 중인 쓰레드를 모두 깨움
 * */
class Ex13_013 {
	public static void main(String[] args) throws Exception {

		Table table = new Table();

		new Thread(new Cook(table), "COOKI").start();
		new Thread(new Customer(table, "donut"), "CUST1").start();
		new Thread(new Customer(table, "burger"), "CUST2").start();

		Thread.sleep(5000);
		System.exit(0);
	}
}

class Customer implements Runnable {
	private Table table;
	private String food;

	Customer(Table table, String food) {
		this.table = table;
		this.food = food;
	}

	public void run() {
		while (true) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
			}
			String name = Thread.currentThread().getName();

			if (eatFood()) {
				System.out.println(name + " ate a " + food);
			} else {
				System.out.println(name + " failed to eat. :(");
			}
		}
	}

	boolean eatFood() {
		return table.remove(food);
	}
}

class Cook implements Runnable {
	private Table table;

	Cook(Table table) {
		this.table = table;
	}

	public void run() {
		while (true) {
			int idx = (int) (Math.random() * table.dishNum());
			table.add(table.dishNames[idx]);

			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
			}
		}
	}
}

class Table {
	String[] dishNames = { "donut", "donut", "burger" };
	final int MAX_FOOD = 6;

	private ArrayList<String> dishes = new ArrayList<>();

	public synchronized void add(String dish) {
		if (dishes.size() >= MAX_FOOD)
			return;
		dishes.add(dish);
		System.out.println("Dishes:" + dishes.toString());
	}

	public boolean remove(String dishName) {
		synchronized (this) {
			while (dishes.size() == 0) {
				String name = Thread.currentThread().getName();
				System.out.println(name + " is waiting.");
				try {
					wait();
					Thread.sleep(500);
				} catch (InterruptedException e) {
				}
			}
			for (int i = 0; i < dishes.size(); i++) {
				if (dishName.equals(dishes.get(i))) {
					dishes.remove(i);
					notify();
					return true;
				}
			}
		}
		return false;
	}

	public int dishNum() {
		return dishNames.length;
	}
}