/*
 * ��¥: 2021/05/09
 * ����: �ڹ��� ����_��ü���� ���/����/���
 * �̸�: ���ϸ�
 * ��ü���� ��� = ���α׷��� ��� + ��ü���� ����(��Ģ)
 * ��ü���� ����� ���� - �ڵ��� ���뼺, �ڵ� ���������� ����
 * ĸ��ȭ/���/������/�߻�
 * */

		//1. Ŭ���� �ۼ�
class Tv1 {
		//TV �Ӽ�(�������)
		String color; //null
		boolean power; //false
		int channel; //0
		//TV ���(�޼���)
		void power() {power = !power;}
		void channelUp() {++channel;}
		void channelDown() {--channel;}
	}

public class Ex6_001 {

	public static void main(String[] args) {
		
		//2. ��ü�� ����
		Tv1 t; //�������� t����
		t = new Tv1(); //Tv t = new Tv(); ���ο� Tv��ü�� t������ ����
		
		//3. ��ü�� ���
		t.channel = 7; //channel���� 7
		t.channelDown(); //�޼��� ȣ��
		System.out.println("���� ä���� "+ t.channel + " �Դϴ�.");
	}
}
