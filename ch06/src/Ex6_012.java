/*
 * 날짜: 2021/05/10
 * 내용: 자바의 정석_참조형 매개변수
 * 이름: 김하린
 * 참조형 매개변수: 변수의 값을 읽고 변경할 수 있음(read & write)
 * */ 
class Data2{
	int x;
}

public class Ex6_012 {	
	public static void main(String[] args) {

		Data2 d = new Data2();
		d.x = 10;
		System.out.println("main() : x = " + d.x);
		
		change(d);
		System.out.println("After change(d)");
		System.out.println("main() : x = " + d.x);
	}
	
	static void change(Data2 d) { //참조형 매개변수
		d.x = 1000;
		System.out.println("change() x = "+ d.x);
	}
}
