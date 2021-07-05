/*
 * 날짜: 2021/05/09
 * 내용: 자바의 정석_객제 생성과 사용(2)
 * 이름: 김하린
 * */

class Tv2 {
		String color; //String은 null로 초기화
		boolean power; //boolean은 false로 초기화
		int channel; //int는 0으로 초기화
		
		void power() {power = !power;}
		void channelUp() {++channel;}
		void channelDown() {--channel;}
	}

public class Ex6_002 {

	public static void main(String[] args) {
		
		Tv2 t1 = new Tv2(); //참조변수 t1 생성
		Tv2 t2 = new Tv2(); //참조변수 t2 생성
		
		System.out.println("t1의 channel값은 "+ t1.channel +"입니다.");
		System.out.println("t2의 channel값은 "+ t2.channel +"입니다.");
		
		t1.channel = 7; 
		System.out.println("t1의 channel값을 7로 변경하였습니다.");

		System.out.println("t1의 channel값은"+ t1.channel +"입니다.");
		System.out.println("t2의 channel값은"+ t2.channel +"입니다.");
		
		
		
	}
}
