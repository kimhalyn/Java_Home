/*
 * 날짜: 2021/05/15
 * 내용: 자바의 정석_매개변수 다형성
 * 이름: 김하린
 * 참조형 매개변수는 메서드 호출 시 자신과 같은 타입 또는 자손타입의 인스턴스를 넘겨줄 수 있음
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
	//조상클래스 생성자 Product(int price)를 호출
	LgTv(){
		super(100); //Audio가격을 100만원으로 함
	}
	//Object클래스의 toString()을 오버라이딩 함
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
	
	//매개변수를 product타입의 참조변수로 두어 -> product클래스 자손타입의 참조변수면 아무거나 매개변수로 올 수 있음
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다");
			return;
		}
		money -= p.price;
		bonuspoint += p.bonuspoint;
		System.out.println(p +"을/를 구입하셨습니다."); //p.toString()과 동일, 참조변수와 문자열 결합에 사용
	}
}
public class Ex7_018 {

	public static void main(String[] args) {

		Buyer b = new Buyer(); 
		b.buy(new LgTv()); //buy(Product p)메서드 호출
		b.buy(new Computer()); //buy(Product p)메서드 호출
		
		System.out.println("현재 남은 돈은 "+ b.money +"만원입니다");
		System.out.println("현재 보너스 점수는 "+ b.bonuspoint +"점입니다");
	}
} 
