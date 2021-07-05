/*
 * 날짜: 2021/05/15
 * 내용: 자바의 정석_인터페이스의 장점(2)
 * 이름: 김하린
 * 개발 시간을 단축할 수 있음, 표준화가 가능(JDBC)
 * 서로 관계없는 클래스들의 관계를 맺을 수 있음 -> 공통의 인터페이스를 만듦
 */
class Unit2{
	int hitPoint;
	final int MAX_HP;
	Unit2(int hp){
		MAX_HP = hp;
	}
}

interface Repairable{}

class GroundUnit extends Unit2{
	GroundUnit(int hp){
		super(hp);
	}
}

class AirUnit extends Unit2{
	AirUnit(int hp){
		super(hp);
	}
}

class Tanks extends GroundUnit implements Repairable{
	Tanks(){
		super(150); //Tanks의 hp는 150 
		hitPoint = MAX_HP;
	}
	public String toString() {
		return "Tanks";
	}
}

class Dropship2 extends AirUnit implements Repairable{
	Dropship2(){
		super(125); //Tanks의 hp는 150 
		hitPoint = MAX_HP;
	}
	public String toString() {
		return "Dropship2";
	}
}

class SVC extends GroundUnit implements Repairable{
		SVC(){
		super(60); //Tanks의 hp는 150 
		hitPoint = MAX_HP;
	}
		void repair(Repairable r) {//인터페이스 r을 구현한 것들만 가능
			if(r instanceof Unit2) {
				Unit2 u2 = (Unit2)r;
				while(u2.hitPoint != u2.MAX_HP) {
					u2.hitPoint++;
				}
				System.out.println(u2.toString()+"의 수리가 끝났습니다");
			}
		}
}
class Marine2 extends GroundUnit{
	Marine2(){
		super(40);
		hitPoint = MAX_HP;
	}
}

public class Ex7_025 {

	public static void main(String[] args) {
		
		Tanks tanks = new Tanks();
		Dropship2 dropship2 = new Dropship2();
		Marine2 marine2 = new Marine2();
		SVC svc = new SVC();
		svc.repair(tanks);
		svc.repair(dropship2);
//		svc.repair(marine2); marine2는 인터페이스 구현 안함 
	}
} 
