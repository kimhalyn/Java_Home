/*
 * 날짜: 2021/06/10
 * 내용: 자바의 정석_프로세스와 쓰레드
 * 이름: 김하린
 * 프로세스: 실행 중인 프로그램, 자원과 쓰레드를 구성 (예)공장
 * 쓰레드: 프로세스 내에서 실제 작업을 수행하는 것, 모든 프로세스은 최소 하나의 쓰레드를 가짐 (예)일꾼
 * 
 * 쓰레드 구현
 * 1) Thread클래스 상속 -> public void run(){Thread클래스의 run()을 오버라이딩}
 * 2) Runnable인터페이스 구현 -> public void run(){Runnable인터페이스의 추상메서드 run()을 구현}
 * 
 * 쓰레드 실행
 * 쓰레드 생성 -> start()호출 -> start()순서대로 호출 x -> OS스케줄러가 실행순서를 결정함
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

class ThreadEx1_1 extends Thread{ //1. Thread클래스 상속
	public void run() { //쓰레드가 수행할 작업
		for(int i=0; i<5; i++) {
			System.out.println(getName());
		}
	}
}

class ThreadEx1_2 implements Runnable{ //2. Runnable인터페이스 상속
	public void run() { //쓰레드가 수행할 작업
		for(int i=0; i<5; i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
}