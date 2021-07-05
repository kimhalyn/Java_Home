/*
 * 날짜: 2021/05/10
 * 내용: 자바의 정석_static메서드와 인스턴스 메서드
 * 이름: 김하린
 * 인스턴스 메서드: 인스턴스 생성 후(참조변수 생성) 인스턴스메서드 호출, 참조변수.메서드이름();
 * static 메서드: 클래스메서드 생성 시 매개변수 사용, 클래스이름.메서드이름();
 */ 
class MyMath2{
	long a, b;

//인스턴스 변수 a,b를 사용하므로 매개변수 필요
long add() {return a+b;}
long subtract() {return a-b;}
long multiply() {return a*b;}
double divide() {return a/b;}

//매개변수만으로 작업, a,b는 지역변수
static long add(long a, long b) {return a+b;}
static long subtract(long a, long b) {return a-b;}
static long multiply(long a, long b) {return a*b;}
static double divide(double a, double b) {return a/b;}
}

public class Ex6_015 {	
	public static void main(String[] args) {

		//static 메서드 호출
		System.out.println(MyMath2.add(200L, 100L));
		System.out.println(MyMath2.subtract(200L, 100L));
		System.out.println(MyMath2.multiply(200L, 100L));
		System.out.println(MyMath2.divide(200L, 100L));

		//인스턴스 메서드 호출
		MyMath2 mm = new MyMath2(); //인스턴스 생성(참조변수)
		mm.a = 200L;
		mm.b = 100L;
		
		System.out.println(mm.add());
		System.out.println(mm.subtract());
		System.out.println(mm.multiply());
		System.out.println(mm.divide());
	}
}
