/*
 * 날짜: 2021/05/15
 * 내용: 자바의 정석_인터페이스를 이용한 다형성
 * 이름: 김하린
 * 클래스에서 조상타입의 참조변수 -> 자손 클래스 인스턴스 생성 가능
 * 인터페이스 또한 참조변수 -> 인터페이스를 구현한 자손 클래스 인스턴스 생성 가능
 * 
 * 메서드의 반환타입이 인터페이스 -> 메서드 내부에서는 인터페이스를 구현한 객체를 반환
 * 						  -> 메서드를 호출한 곳에서는 메서드 반환타입을 일치시킴 	
 */
abstract class Unit1{
	int x, y;
	abstract void move(int x, int y);
	void stop() {System.out.println("멈춥니다");}
}
interface Fightable1{//인터페이스의 모든 메서드는 public abstract
	void move(int x, int y); //public abstract가 생략
	void attack(Fightable1 f); //public abstract가 생략
}
class Fighter1 extends Unit1 implements Fightable1{
	//오버라이딩 조건: 조상보다 접근제어자가 좁으면 안됨(public 사용 까먹지 말 것)
	public void move(int x, int y) { 
		System.out.println("["+ x +","+ y +"]로 이동");
	}
	public void attack(Fightable1 f) {
		System.out.println(f+"를 공격");
	}
	//싸울 수 있는 상대를 불러옴
	Fightable1 getFightable() {
		Fighter1 f = new Fighter1();
		return f; //더 정확하게 (Fightable1)f; 
	}
}
public class Ex7_023 {

	public static void main(String[] args) {

		Fighter1 f = new Fighter1(); //가능
		Fightable1 f2 = f.getFightable();
		
		
//		Fightable1 f = new Fighter1(); //가능
		Unit1 u = new Fighter1(); 
		
		u.move(100, 200);
		u.stop();
//		u.attack(); 에러 -> Unit1에는 attack()가 없어서 호출불가
		
		f.move(100, 200);
		f.attack(new Fighter1() ); //Fighter1 f2 = new Fighter1();, f.attack(f2);를 한 문장으로 만든 것
//		f.stop(); 에러 -> Fightable1에는 stop()가 없어서 호출불가
	}
} 
