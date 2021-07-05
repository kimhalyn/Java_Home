/*
 * 날짜: 2021/05/10
 * 내용: 자바의 정석_기본형 매개변수
 * 이름: 김하린
 * 기본형 매개변수: 변수의 값을 읽기만 가능(read only)
 * */ 
class Data{
	int x;
}

public class Ex6_011 {	
	public static void main(String[] args) {

		Data d = new Data();
		d.x = 10;
		System.out.println("main() 1: x = " + d.x);
		
		change(d.x);
		System.out.println("After change(d.x)");
		System.out.println("main() 2: x = " + d.x);
	}
	
//		change(d);
//		System.out.println("After change(d.x)");
//		System.out.println("main() : x = " + d.x);
//	
	static void change(int x) { //기본형 매개변수
		x = 1000;
		System.out.println("change() x = "+ x);
	}
	
//	static void change(d) {
//		d.x = 1000;
//		System.out.println("change() x = "+ x);
//	}
//	
}
