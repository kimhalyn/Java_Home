/*
 * 날짜: 2021/05/13
 * 내용: 자바의 정석_포함 관계
 * 이름: 김하린
 * 클래스의 멤버변수로 다른 클래스 타입의 참조변수를 선언
 * 작은 단위의 클래스를 만들고, 이 들을 조합해서 클래스를 만듦(복잡도를 줄일 수 있음) 
 * 상속관계: A는 B이다.
 * 포함관계: A는 B를 가지고 있다.
 */
class MyPoint{
	int x;
	int y;
}

//class Circle extends MyPoint{ 상속
//	int r;
//}

class Circle{ //포함
	MyPoint p = new MyPoint(); //참조변수 초기화 
	int r;
}

public class Ex7_002 {

	public static void main(String[] args) {

	Circle c = new Circle();
	
//	상속
//	c.x = 1;
//	c.y = 2;
//	c.r = 3;
//	
//	System.out.println("c.x ="+ c.x);
//	System.out.println("c.y ="+ c.y);
//	System.out.println("c.r ="+ c.r);
//	

	//포함
	c.p.x = 4;
	c.p.y = 5;
	c.r = 6;
	
	System.out.println("c.p.x = "+ c.p.x);
	System.out.println("c.p.y = "+ c.p.y);
	System.out.println("c.r ="+ c.r);
	}
}
