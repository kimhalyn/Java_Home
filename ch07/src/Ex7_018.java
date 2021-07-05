/*
 * ��¥: 2021/05/15
 * ����: �ڹ��� ����_�Ű����� ������
 * �̸�: ���ϸ�
 * ������ �Ű������� �޼��� ȣ�� �� �ڽŰ� ���� Ÿ�� �Ǵ� �ڼ�Ÿ���� �ν��Ͻ��� �Ѱ��� �� ����
 */
class Product{
	int price;
	int bonuspoint;
	
	Product(int price){
		this.price = price;
		bonuspoint = (int)(price/10.0);
	}
}
class LgTv extends Product{
	//����Ŭ���� ������ Product(int price)�� ȣ��
	LgTv(){
		super(100); //Audio������ 100�������� ��
	}
	//ObjectŬ������ toString()�� �������̵� ��
	public String toString() {return "LgTv";}
}
class Computer extends Product{
	Computer(){
		super(200);
	}
	public String toString() {return "Computer";}
}

class Buyer{
	int money = 1000;
	int bonuspoint = 0;
	
	//�Ű������� productŸ���� ���������� �ξ� -> productŬ���� �ڼ�Ÿ���� ���������� �ƹ��ų� �Ű������� �� �� ����
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("�ܾ��� �����Ͽ� ������ �� �� �����ϴ�");
			return;
		}
		money -= p.price;
		bonuspoint += p.bonuspoint;
		System.out.println(p +"��/�� �����ϼ̽��ϴ�."); //p.toString()�� ����, ���������� ���ڿ� ���տ� ���
	}
}
public class Ex7_018 {

	public static void main(String[] args) {

		Buyer b = new Buyer(); 
		b.buy(new LgTv()); //buy(Product p)�޼��� ȣ��
		b.buy(new Computer()); //buy(Product p)�޼��� ȣ��
		
		System.out.println("���� ���� ���� "+ b.money +"�����Դϴ�");
		System.out.println("���� ���ʽ� ������ "+ b.bonuspoint +"���Դϴ�");
	}
} 
