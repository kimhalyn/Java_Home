/*
 * ��¥: 2021/06/10
 * ����: �ڹ��� ����_��Ƽ������(�����尡 �����ư��鼭 �۾�)
 * �̸�: ���ϸ�
 * 
 * */
public class Ex13_004 {
	static long startTime = 0;
	
	public static void main(String[] args) {

		ThreadEX3_1 th1 = new ThreadEX3_1();
		th1.start();
		startTime = System.currentTimeMillis();
		
		for (int i = 0; i < 300; i++) {
			System.out.printf("%s", new String("-"));
		}
		System.out.println("�ҿ�ð�1:" + (System.currentTimeMillis() - startTime));
	}
}
class ThreadEX3_1 extends Thread{
	public void run() {
		for(int i=0; i<300; i++) {
			System.out.printf("%s", new String("|"));
		}
		System.out.println("�ҿ�ð�2:"+ (System.currentTimeMillis()));
	}
}