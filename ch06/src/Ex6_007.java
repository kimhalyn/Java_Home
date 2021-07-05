/*
 * 날짜: 2021/05/09
 * 내용: 자바의 정석_클래스 변수와 인스턴스 변수
 * 이름: 김하린
 * 클래스 변수: 모든 객체가 공통적으로 유지(공통 속성)
 * 인스턴스 변수: 객체마다 다르게 유지
 * */
class Card{ //클래스 생성
//		카드의 종류, 숫자는 매번 달라짐
		String kind; //인스턴스 변수
		int number; //인스턴스 변수
//		카드의 크기는 동일함
		static int width = 100; //클래스 변수
		static int height = 250; //클래스 변수
	}

public class Ex6_007 {	
	
	public static void main(String[] args) {
		
//		클래스 변수라서 따로 생성없이 -> 클래스명.변수 생성
		System.out.println("Card.width = " + Card.width);
		System.out.println("Card.height = " + Card.height);

		Card c1 = new Card(); //객체 생성
//		인스턴스 생성
		c1.kind = "Heart"; 
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;
		
		System.out.println("c1은 "+ c1.kind +", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height + ")");
		System.out.println("c2은 "+ c2.kind +", " + c2.number + "이며, 크기는 (" + c2.width + ", " + c2.height + ")");

		System.out.println("c1의 width와 height를 각각 50, 80으로 변경합니다.");
		
		Card.width = 50; //클래스 변수 c1.width = 50;
		Card.height = 80;
		
		System.out.println("c1은 "+ c1.kind +", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height + ")");
		System.out.println("c2은 "+ c2.kind +", " + c2.number + "이며, 크기는 (" + c2.width + ", " + c2.height + ")");
		
	}
}
