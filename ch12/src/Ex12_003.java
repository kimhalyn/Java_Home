import java.util.*;
/*
 * 날짜: 2021/06/01
 * 내용: 자바의 정석_지네릭스 용어/타입과 다형성
 * 이름: 김하린
 * Box<T>: 지네릭 클래스, 'T Box'로 읽음
 * T: 타입 변수 or 타입 매개변수
 * Box: 원시 타입
 * 
 * 참조 변수와 생성자에 대입된 타입은 일치해야 함
 */
class Product {}
class Tv1 extends Product {}
class Audio1 extends Product {}

class Ex12_003 {
	public static void main(String[] args) {
		ArrayList<Product> productList = new ArrayList<Product>();
		ArrayList<Tv1>      tvList = new ArrayList<Tv1>();
//  	ArrayList<Product> tvList = new ArrayList<Tv>(); // 에러, 타입변수가 달라서
// 		List<Tv>           tvList = new ArrayList<Tv>(); // OK. 다형성(List가 ArrayList 조상)

		productList.add(new Tv1()); //product의 자손인 Tv와 Audio 모두 가능
		productList.add(new Audio1());

		tvList.add(new Tv1());
		tvList.add(new Tv1());

		printAll(productList);
		// printAll(tvList); // 컴파일 에러 발생
	}

	public static void printAll(ArrayList<Product> list) {
		for (Product p : list)
			System.out.println(p);
	}
}
