/*
 * 날짜: 2021/05/13
 * 내용: 자바의 정석_접근 제어자
 * 이름: 김하린
 * private: 같은 클래스 내에서만 접근 가능
 * public: 접근 제한이 전혀 없음
 * (default): 같은 패키지(클래스) 내에서만 접근 가능
 * protected: 같은 패키지(클래스) 내, 다른 패키지의 자손 클래스에서 접근 가능
 */
package pkg2;

import pkg1.Ex7_012;

class MyChild extends Ex7_012{
	public void printMember() {
//		System.out.println(prv); 에러 -> private는 같은 클래스에서만 가능
//		System.out.println(dft); 에러 -> default는 같은 패키지에서만 가능
		System.out.println(prt); 
		System.out.println(pub);
	}
	
}

public class Ex7_013 {
	public static void main(String[] args) {
		
		Ex7_012 p = new Ex7_012();
//		System.out.println(p.prv); 에러 -> 같은 클래스에서만 가능 
//		System.out.println(p.dft); 에러 -> 같은 패키지에서만 가능
//		System.out.println(p.prt); 에러 -> 같은 패키지 + 타 패키지 자손에서 가능
		System.out.println(p.pub);
	}
}
