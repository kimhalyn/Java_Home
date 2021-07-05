/*
 * 날짜: 2021/05/13
 * 내용: 자바의 정석_오버라이딩
 * 이름: 김하린
 * 상속받은 조상의 메서드를 자신에 맞게 수정
 * 선언부는 변경 x, 구현부 {}만 변경 o
 * 오버라이딩 조건: - 선언부가 조상 클래스 메서드와 일치
 *              - 접근 제어자(public, protected, default, private)를 조상 클래스의 메서드보다 좁은 범위로 변경할 수 없음
 *              - 예외는 조상 클래스의 메서드보다 더 많이 선언할 수 없음
 */
class Point{
	int x;
	int y;
	
	Point(int x, int y){ //생성자
		this.x = x;
		this.y = y;
	}
	
	public String toString() { //object 클래스의 toString()을 오버라이딩
		return "x:"+ x + ", y:"+ y;
	}
}

public class Ex7_004 {

	public static void main(String[] args) {
		
//		Point3D p = new Point3D();
//		p.x = 3;
//		p.y = 5;  
		
		Point p = new Point(3, 5); //생성자 이용해서 코드 간결화
		
		//다양한 호출 방법
		System.out.println(p);
		System.out.println(p.toString());
		System.out.println("x:"+p.x);
		System.out.println("y:"+p.y);
	}
}
