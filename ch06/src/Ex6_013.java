/*
 * 날짜: 2021/05/10
 * 내용: 자바의 정석_참조형 매개변수
 * 이름: 김하린
 * 참조형 매개변수: 변수의 값을 읽고 변경할 수 있음
 * */ 

public class Ex6_013 {	
	public static void main(String[] args) {

		Ex6_013 r = new Ex6_013();
		
		int result = r.add(3, 5);
		System.out.println(result);
		
		int[] result2 = {0}; //배열을 생성하고 result2[0]의 값을 0으로 초기화
		r.add(3, 5, result2);
		System.out.println(result2[0]);
		
	}
	int add(int a, int b) {
		return a+b;
	}
	
	void add(int a, int b, int[] result) { //반환값이 없는 메서드로 변환
		result[0] = a+b;
	}
}
