/*
 * 날짜: 2021/05/15
 * 내용: 자바의 정석_여러 종류의 객체를 배열로 다루기
 * 이름: 김하린
 * 조상타입의 배열에 자손들의 객체를 담을 수 있음
 */
class Product1{
	int price;
	int bonuspoint;
	
	Product1(int price){
		this.price = price;
		bonuspoint = (int)(price/10.0);
	}
	Product1(){} //기본생성자
}
class LgTv1 extends Product1{
	//조상클래스 생성자 Product(int price)를 호출
	LgTv1(){
		super(100); //Audio가격을 100만원으로 함
	}
	//Object클래스의 toString()을 오버라이딩 함
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
	Product1[] cart = new Product1[10]; //구입한 상품을 저장하기 위한 배열
	int i = 0;
	
	//매개변수를 product타입의 참조변수로 두어 -> product클래스 자손타입의 참조변수면 아무거나 매개변수로 올 수 있음
	void buy(Product1 p) {
		if(money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다");
			return;
		}
		money -= p.price;
		bonuspoint += p.bonuspoint;
		cart[i++] = p; //구입한 제품을 Product1[] cart에 저장 
		System.out.println(p +"을/를 구입하셨습니다."); //p.toString()과 동일, 참조변수와 문자열 결합에 사용
	}
	void summary() {  //구입한 물품에 대한 정보를 요약해서 보여줌
		int sum = 0; //구입한 물품의 가격합계
		String cartList = ""; //구입한 물품목록
		
		for(int i=0; i<cart.length; i++) {
			if(cart[i]==null) break; //카트가 비어있을 때 -> null
			sum += cart[i].price;
			cartList += cart[i] + ", "; // cart[i].toString()과 동일
		}
		System.out.println("구입하신 물품의 총 금액은 "+ sum +"만원입니다");
		System.out.println("구입하신 물품은 "+ cartList +"입니다");
	}
} 
public class Ex7_019 {

	public static void main(String[] args) {

		Buyer1 b = new Buyer1(); 
		b.buy(new LgTv1()); //buy(Product p)메서드 호출
		b.buy(new Computer1()); //buy(Product p)메서드 호출
		b.buy(new Audio1());
		b.summary();
		
		System.out.println("현재 남은 돈은 "+ b.money +"만원입니다");
		System.out.println("현재 보너스 점수는 "+ b.bonuspoint +"점입니다");
	}
} 
