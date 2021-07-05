/*
 * ��¥: 2021/05/15
 * ����: �ڹ��� ����_���� ������ ��ü�� �迭�� �ٷ��
 * �̸�: ���ϸ�
 * ����Ÿ���� �迭�� �ڼյ��� ��ü�� ���� �� ����
 */
class Product1{
	int price;
	int bonuspoint;
	
	Product1(int price){
		this.price = price;
		bonuspoint = (int)(price/10.0);
	}
	Product1(){} //�⺻������
}
class LgTv1 extends Product1{
	//����Ŭ���� ������ Product(int price)�� ȣ��
	LgTv1(){
		super(100); //Audio������ 100�������� ��
	}
	//ObjectŬ������ toString()�� �������̵� ��
	public String toString() {return "LgTv1";}
}
class Computer1 extends Product1{
	Computer1(){
		super(200);
	}
	public String toString() {return "Computer1";}
}

class Audio1 extends Product1{
	Audio1(){
		super(50);
	}
	public String toString() {return "Audio1";}
}
class Buyer1{
	int money = 1000;
	int bonuspoint = 0;
	Product1[] cart = new Product1[10]; //������ ��ǰ�� �����ϱ� ���� �迭
	int i = 0;
	
	//�Ű������� productŸ���� ���������� �ξ� -> productŬ���� �ڼ�Ÿ���� ���������� �ƹ��ų� �Ű������� �� �� ����
	void buy(Product1 p) {
		if(money < p.price) {
			System.out.println("�ܾ��� �����Ͽ� ������ �� �� �����ϴ�");
			return;
		}
		money -= p.price;
		bonuspoint += p.bonuspoint;
		cart[i++] = p; //������ ��ǰ�� Product1[] cart�� ���� 
		System.out.println(p +"��/�� �����ϼ̽��ϴ�."); //p.toString()�� ����, ���������� ���ڿ� ���տ� ���
	}
	void summary() {  //������ ��ǰ�� ���� ������ ����ؼ� ������
		int sum = 0; //������ ��ǰ�� �����հ�
		String cartList = ""; //������ ��ǰ���
		
		for(int i=0; i<cart.length; i++) {
			if(cart[i]==null) break; //īƮ�� ������� �� -> null
			sum += cart[i].price;
			cartList += cart[i] + ", "; // cart[i].toString()�� ����
		}
		System.out.println("�����Ͻ� ��ǰ�� �� �ݾ��� "+ sum +"�����Դϴ�");
		System.out.println("�����Ͻ� ��ǰ�� "+ cartList +"�Դϴ�");
	}
} 
public class Ex7_019 {

	public static void main(String[] args) {

		Buyer1 b = new Buyer1(); 
		b.buy(new LgTv1()); //buy(Product p)�޼��� ȣ��
		b.buy(new Computer1()); //buy(Product p)�޼��� ȣ��
		b.buy(new Audio1());
		b.summary();
		
		System.out.println("���� ���� ���� "+ b.money +"�����Դϴ�");
		System.out.println("���� ���ʽ� ������ "+ b.bonuspoint +"���Դϴ�");
	}
} 
