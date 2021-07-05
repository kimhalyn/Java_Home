/*
 * 날짜: 2021/05/10
 * 내용: 자바의 정석_return문, 반환값
 * 이름: 김하린
 * return문: 실행 중인 메서드를 종료하고 호출된 곳으로 되돌아감
 * 반환 타입이 void -> return 생략 가능, 그렇지 않다면 메서드 안에 반드시 return문 필요
 * 메서드 입력(매개변수)은 여러 개 가능, 하지만 출력(반환값)은 반드시 최대 한 개
 * 
 * 메서드 타입과 반환값의 타입이 반드시 일치해야 함
 * */
class Math {
	void printGugudan(int dan) {
		if (!(2 <= dan && dan <= 9)) {
			return; // dan이 조건문에 해당하면, 메서드 종료하고 돌아감
		}
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %2d%n", dan, i, dan * i);
		}
	}

	long max(long a, long b) {
		if (a > b) {
			return a; // 조건식이 참일때만 실행
		} else {
			return b; // 조건식이 거짓일때만 실행
		}
	}
}

public class Ex6_009 {
	public static void main(String[] args) {

		Math mm = new Math(); // 객체 생성
		// 메서드 호출
		mm.printGugudan(3);
		long result = mm.max(2, 0);
		
		System.out.println();
		
		System.out.println(result);

	}
}
