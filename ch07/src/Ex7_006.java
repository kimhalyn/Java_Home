/*
 * 날짜: 2021/05/13
 * 내용: 자바의 정석_super() - 조상의 생성자
 * 이름: 김하린
 * 조상의 생성자를 호출할 때 사용
 * 조상의 멤버는 조상 생성자를 호출해서 초기화
 * 주의!! 생성자 첫 줄에 반드시 생성자를 호출해야 함 -> 아니면 컴파일러가 super();를 자동 삽입
 */
class Point2{
	int x = 10;
	int y = 20;
	
	Point2(int x, int y){ //생성자 -> 첫 줄에 생성자 호출안해서 super();가 생성됨
//		super(); -> Object 클래스
		this.x = x;
		this.y = y;
	}
}
class Point2_3D extends Point2{
	int z = 30;
	
	Point2_3D() {
		this(100, 200, 300); //Point2_3D(int x, int y, int z) 호출
	}
	Point2_3D(int x, int y, int z){
		super(x, y); //Point2(int x, int y) 호출
		this.z = z;
	}
}
public class Ex7_006 {

	public static void main(String[] args) {
		Child c = new Child();
		c.method();
	}
}
