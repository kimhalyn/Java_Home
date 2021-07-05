/*
 * 날짜: 2021/05/13
 * 내용: 자바의 정석_접근 제어자
 * 이름: 김하린
 * private: 같은 클래스 내에서만 접근 가능
 * public: 접근 제한이 전혀 없음
 * (default): 같은 패키지(클래스) 내에서만 접근 가능
 * protected: 같은 패키지(클래스) 내, 다른 패키지의 자손 클래스에서 접근 가능
 * 
 * 하나의 소스파일에는 public 클래스가 1개만 존재
 * 소스파일 이름과 public클래스의 이름이 같아야 함
 */
package pkg1;

public class Ex7_012{
	private 	int prv; //같은 클래스 
				int dft; //같은 패키지(클래스)
	protected 	int prt; //같은 패키지(클래스), 다른 패키지 자손 클래스
	public 		int pub; //제한 없음
	
	public void printMember() {
		System.out.println(prv);
		System.out.println(dft);
		System.out.println(prt);
		System.out.println(pub);
	}
}
 class  MyParent{

	public static void main(String[] args) {
		Ex7_012 p = new Ex7_012();
//		System.out.println(p.prv); 에러 -> private 접근 제어자는 같은 클래스에서만 가능
		System.out.println(p.dft);
		System.out.println(p.prt);
		System.out.println(p.pub);
		
		
	}
		
} 
