/*
 * ��¥: 2021/05/09
 * ����: �ڹ��� ����_���� ������ ���(2)
 * �̸�: ���ϸ�
 * */

class Tv2 {
		String color; //String�� null�� �ʱ�ȭ
		boolean power; //boolean�� false�� �ʱ�ȭ
		int channel; //int�� 0���� �ʱ�ȭ
		
		void power() {power = !power;}
		void channelUp() {++channel;}
		void channelDown() {--channel;}
	}

public class Ex6_002 {

	public static void main(String[] args) {
		
		Tv2 t1 = new Tv2(); //�������� t1 ����
		Tv2 t2 = new Tv2(); //�������� t2 ����
		
		System.out.println("t1�� channel���� "+ t1.channel +"�Դϴ�.");
		System.out.println("t2�� channel���� "+ t2.channel +"�Դϴ�.");
		
		t1.channel = 7; 
		System.out.println("t1�� channel���� 7�� �����Ͽ����ϴ�.");

		System.out.println("t1�� channel����"+ t1.channel +"�Դϴ�.");
		System.out.println("t2�� channel����"+ t2.channel +"�Դϴ�.");
		
		
		
	}
}
