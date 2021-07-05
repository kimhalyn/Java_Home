/*
 * 날짜: 2021/05/10
 * 내용: 자바의 정석_변수의 초기화(초기화 블럭)
 * 이름: 김하린
 * 클래스 초기화 블럭은 처음 메모리에 로딩될 때 한 번만 수행
 * 인스턴스 초기화 블럭은 인스턴스가 생성될 때마다 수행
 * 항상 클래스 변수가 인스턴스 변수보다 먼저 수행
 */ 
class Ex6_020 {	

	static {
		System.out.println("static()");
	}
	{
		System.out.println("{}");
	}
	public Ex6_020() {
		System.out.println("생성자");
	}
	
	public static void main(String[] args) {

		System.out.println("Ex6_020 ex1 = new Ex6_020(); ");
		Ex6_020 ex1 = new Ex6_020();
		
		System.out.println("Ex6_020 ex2 = new Ex6_020(); ");
		Ex6_020 ex2 = new Ex6_020();
	}
}
