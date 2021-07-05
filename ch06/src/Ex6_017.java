/*
 * 날짜: 2021/05/10
 * 내용: 자바의 정석_기본 생성자
 * 이름: 김하린
 * 인스턴스가 생성될 때마다 호출되는 '인스턴스 초기화 메서드'
 * 클래스와 생성자 이름이 같아야 함
 * 리턴값이 없음(void 안붙임)
 * 모든 클래스는 반드시 생성자를 가져야 함
 * 기본 생성자: 매개변수가 없는 생성자
 *           매개변수가 있는 생성자
 */ 
class Data_1{ //생성자가 하나도 없을 때, 컴퓨터가 자동으로 기본 생성자를 생성함
	int value;
}
class Data_2{
	int value;

	Data_2(){} //기본 생성자
	Data_2(int x){ //매개변수가 있는 생성자
		value = x;
	}
}

public class Ex6_017 {	
	public static void main(String[] args) {

		Data_1 d1 = new Data_1();
		Data_2 d2 = new Data_2(10); //매개변수가 있는 생성자이므로, 매개변수를 넣거나, 기본 생성자 추가해야 함

		System.out.println(d2.value);
	}
}
