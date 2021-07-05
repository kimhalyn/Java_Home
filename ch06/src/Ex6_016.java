/*
 * 날짜: 2021/05/10
 * 내용: 자바의 정석_오버로딩(overloading)
 * 이름: 김하린
 * 1개의 메서드 이름에 여러 개의 메서드를 정의(예. println)
 * 오버로딩 성립조건
 * 1. 메서드 이름이 같아야 함(=하는 일이 같다)
 * 2. 매개변수 개수 또는 타입이 달라야 함 (전부 같으면 -> 중복정의로 에러 발생)
 * 3. 반환 타입은 영향 없음
 */ 
class MyMath3{
	
	int add(int a, int b) {
		System.out.printf("int add(int a, int b) - ");
		return a+b;
	}
	long add(int a, long b) {
		System.out.printf("int add(int a, long b) - ");
		return a+b;
	}
	long add(long a, int b) {
		System.out.printf("int add(long a, int b) - ");
		return a+b;
	}
	long add(long a, long b) {
		System.out.printf("int add(long a, long b) - ");
		return a+b;
	}
	int add(int[] a) {
		System.out.print("int add(int[] a) - ");
		int result = 0;
		for(int i=0; i<a.length; i++) {
			result += a[i];
		}
		return result;
	}
}

public class Ex6_016 {	
	public static void main(String[] args) {

		MyMath3 mm = new MyMath3();
		System.out.println("mm.add(3, 3) 결과:"+ mm.add(3, 3));
		System.out.println("mm.add(3L, 3) 결과:"+ mm.add(3L, 3));
		System.out.println("mm.add(3, 3L) 결과:"+ mm.add(3, 3L));
		System.out.println("mm.add(3:, 3L) 결과:"+ mm.add(3L, 3L));
		
		int[] a = {100, 200, 300};
		System.out.println("mm.add(a) 결과:"+ mm.add(a));
	}
}
