/*
 * ��¥: 2021/05/15
 * ����: �ڹ��� ����_�������̽��� ����(2)
 * �̸�: ���ϸ�
 * ���� �ð��� ������ �� ����, ǥ��ȭ�� ����(JDBC)
 * ���� ������� Ŭ�������� ���踦 ���� �� ���� -> ������ �������̽��� ����
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
		super(150); //Tanks�� hp�� 150 
		hitPoint = MAX_HP;
	}
	public String toString() {
		return "Tanks";
	}
}

class Dropship2 extends AirUnit implements Repairable{
	Dropship2(){
		super(125); //Tanks�� hp�� 150 
		hitPoint = MAX_HP;
	}
	public String toString() {
		return "Dropship2";
	}
}

class SVC extends GroundUnit implements Repairable{
		SVC(){
		super(60); //Tanks�� hp�� 150 
		hitPoint = MAX_HP;
	}
		void repair(Repairable r) {//�������̽� r�� ������ �͵鸸 ����
			if(r instanceof Unit2) {
				Unit2 u2 = (Unit2)r;
				while(u2.hitPoint != u2.MAX_HP) {
					u2.hitPoint++;
				}
				System.out.println(u2.toString()+"�� ������ �������ϴ�");
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
//		svc.repair(marine2); marine2�� �������̽� ���� ���� 
	}
} 
