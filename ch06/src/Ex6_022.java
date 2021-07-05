/*
 * 날짜: 2021/05/10
 * 내용: 자바의 정석_변수의 초기화(멤버변수의 초기화 시기와 순서)
 * 이름: 김하린
 * 멤버변수(iv, cv)는 자동 초기화
 * 지역변수(lv)는 수동 초기화(메서드 내에서 선언되어 사용)
 * 초기화 방법: 1.자동 초기화, 2.간단 초기화(대입연산자 '=' 사용), 3.복잡 초기화(cv일 때 -> static{}, iv일 때 -> 생성자 사용)
 */ 
class Product{
	static int count = 0;
	int serialNo;
	{
		++count;
		serialNo = count;
	}
	public Product() {} //기본 생성자, 생략 가능
}
public class Ex6_022 {	
	public static void main(String[] args) {
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		Product p4 = new Product();
		
		System.out.println("p1의 제품번호(serial no)는 "+ p1.serialNo);
		System.out.println("p2의 제품번호(serial no)는 "+ p2.serialNo);
		System.out.println("p3의 제품번호(serial no)는 "+ p3.serialNo);
		System.out.println("생산된 제품의 수는 모두 "+ Product.count +"개 입니다.");
		
		
	}
	
}
		


