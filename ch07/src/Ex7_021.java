/*
 * 날짜: 2021/05/15
 * 내용: 자바의 정석_추상 클래스 작성
 * 이름: 김하린
 * 여러 클래스에 공통적으로 사용될 수 있는 추상 클래스를 바로 작성하거나
 * 기존 클래스의 공통 부분을 뽑아서 추상 클래스를 만듦
 */
abstract class Unit{
	int x, y;
	abstract void move(int x, int y);
	void stop() {}
}
class Marine extends Unit{
	void move(int x, int y) {
		System.out.println("Marine[x="+ x +", y=" + y +"]");
	}
	void stimPack() {}
}
class Tank extends Unit{
	void move(int x, int y) {
		System.out.println("Tank[x="+ x +", y=" + y +"]");
	}
	void changeMode() {}
}
class Dropship extends Unit{
	void move(int x, int y) {
		System.out.println("Dropship[x="+ x +", y=" + y +"]");
	}
	void load() {}
	void unload() {}
}
public class Ex7_021 {

	public static void main(String[] args) {

//		Object[] group = new Object[3]; Object클래스가 최고조상으로 객체 생성 가능(다형성)  
//		Unit[] group = new Unit[3];
//		group[0] = new Marine();
//		group[1] = new Tank();
//		group[2] = new Dropship();
		
		Unit[] group = {new Marine(), new Tank(), new Dropship()};
		
		for(int i=0; i<group.length; i++) { //Object클래스에는 move메서드가 존재하지 않으므로 에러발생
			group[i].move(100, 200); //실제 구현된 각 클래스의 메서드 호출 
		}
	}
} 
