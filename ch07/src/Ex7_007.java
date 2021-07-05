/*
 * 날짜: 2021/05/13
 * 내용: 자바의 정석_super() - 조상의 생성자
 * 이름: 김하린
 */
class Points{
	int x;
	int y;
	
	Points(){} //해결방법 1)
	Points(int x, int y){ //생성자 -> 첫 줄에 생성자 호출안해서 super();가 생성됨
//		super(); -> Object 클래스
		this.x = x;
		this.y = y;
	}
	String getLocation() {
		return "x :"+ x + ", y :"+ y;
	}
}

class Points3D extends Points{
	int z;
	
	Points3D(int x, int y, int z){
//		생성자 없어서 super();를 자동생성하면 -> 
//		Points3D의 조상인 Points()를 호출하게 됨 -> 
//		근데 조상에 기본 points()생성자가 없음 왜? -> 
//		points(int x, int y)생성자가 있어서 기본 생성자가 자동 생성 x
//		해결방법 -> 1)points(){} 기본 생성자 만들어 주거나, 2)super()생성자 사용해서 코드 작성
//		this.x = x;
//		this.y = y;
		super(x, y); //해결방법 2)
		this.z = z;
	}
	String getLocation() { //오버라이딩
		return "x :"+ x + ", y :"+ y +", z :"+ z;
	}
}
public class Ex7_007 {

	public static void main(String[] args) {
		Points3D p3 = new Points3D(1, 2, 3);
	
		System.out.println(p3.x);
	}
	
}
