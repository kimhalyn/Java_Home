/*
 * ��¥: 2021/05/09
 * ����: �ڹ��� ����_���� ������ ���(3)
 * �̸�: ���ϸ�
 * */

class Tv3 {
		String color; //String�� null�� �ʱ�ȭ
		boolean power; //boolean�� false�� �ʱ�ȭ
		int channel; //int�� 0���� �ʱ�ȭ
		
		void power() {power = !power;}
		void channelUp() {++channel;}
		void channelDown() {--channel;}
	}

public class Ex6_003 {

	public static void main(String[] args) {
		
		Tv3 t1 = new Tv3();
		Tv3 t2 = new Tv3();
		
		System.out.println("t1�� channel���� "+ t1.channel +"�Դϴ�.");
		System.out.println("t2�� channel���� "+ t2.channel +"�Դϴ�.");
		
		t2 = t1; //�������� t2�� t1���� ����
		t1.channel = 7;
		System.out.println("t1�� channel���� 7�� �����Ͽ����ϴ�.");

		System.out.println("t1�� channel����"+ t1.channel +"�Դϴ�.");
		System.out.println("t2�� channel����"+ t2.channel +"�Դϴ�.");
		
		
		
	}
}
