/*
 * ��¥: 2021/05/09
 * ����: �ڹ��� ����_Ŭ���� ������ �ν��Ͻ� ����
 * �̸�: ���ϸ�
 * Ŭ���� ����: ��� ��ü�� ���������� ����(���� �Ӽ�)
 * �ν��Ͻ� ����: ��ü���� �ٸ��� ����
 * */
class Card{ //Ŭ���� ����
//		ī���� ����, ���ڴ� �Ź� �޶���
		String kind; //�ν��Ͻ� ����
		int number; //�ν��Ͻ� ����
//		ī���� ũ��� ������
		static int width = 100; //Ŭ���� ����
		static int height = 250; //Ŭ���� ����
	}

public class Ex6_007 {	
	
	public static void main(String[] args) {
		
//		Ŭ���� ������ ���� �������� -> Ŭ������.���� ����
		System.out.println("Card.width = " + Card.width);
		System.out.println("Card.height = " + Card.height);

		Card c1 = new Card(); //��ü ����
//		�ν��Ͻ� ����
		c1.kind = "Heart"; 
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;
		
		System.out.println("c1�� "+ c1.kind +", " + c1.number + "�̸�, ũ��� (" + c1.width + ", " + c1.height + ")");
		System.out.println("c2�� "+ c2.kind +", " + c2.number + "�̸�, ũ��� (" + c2.width + ", " + c2.height + ")");

		System.out.println("c1�� width�� height�� ���� 50, 80���� �����մϴ�.");
		
		Card.width = 50; //Ŭ���� ���� c1.width = 50;
		Card.height = 80;
		
		System.out.println("c1�� "+ c1.kind +", " + c1.number + "�̸�, ũ��� (" + c1.width + ", " + c1.height + ")");
		System.out.println("c2�� "+ c2.kind +", " + c2.number + "�̸�, ũ��� (" + c2.width + ", " + c2.height + ")");
		
	}
}
