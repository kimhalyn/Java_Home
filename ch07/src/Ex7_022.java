/*
 * 날짜: 2021/05/15
 * 내용: 자바의 정석_인터페이스
 * 이름: 김하린
 * 인터페이스: 추상 메서드의 집합, 구현된 것이 하나도 없는 설계도, 모든 멤버가 public(상수, static메서드, 디폴트 메서드 포함)
 * cf) 추상 클래스: 추상 메서드를 포함하고 있는 클래스, 클래스의 일부가 구현되지 않은 것
 * 
 * 인터페이스 상속: 인터페이스만 가능(Object가 최고조상 x), 다중 상속 가능(조상이 여러 개) -> 구현부 자체가 없음
 * cf) 클래스는 단일 상속만 가능 -> 메서드 선언부가 같고 구현부가 다를 경우 자식이 어느 쪽을 상속받을지 결정할 수 없음
 * 
 * 인터페이스 구현: 인터페이스에 정의된 추상 메서드를 완성하는 것, 즉 메서드의 구현부를 완성하는 것(class 클래스 이름 implements 인터페이스 이름{})
 * 만약 일부만 구현하는 경우, 클래스 앞에 abstract를 붙임
 * 
 * 추상 클래스와 인터페이스의 공통점: 추상 메서드를 가짐, 차이점: 인터페이스는 iv를 가질 수 없음
 */
class Units{
	int currentHP;
	int x;
	int y;
}
interface Movable{
	void move(int x, int y);
}
interface Attackable{
	void attack(Units u);
}
interface Fightable extends Movable, Attackable{}
class Fighter extends Units implements Fightable{
	public void move(int x, int y) {}
	public void attack(Units u) {}
}

public class Ex7_022 {

	public static void main(String[] args) {

		Fighter f = new Fighter();
		
		if(f instanceof Units) //instanceof: 자신과 조상에 대해 항상 true 반환
			System.out.println("f는 Units클래스의 자손입니다");
		if(f instanceof Fightable)
			System.out.println("f는 Fightable인터페이스를 구현했습니다");
		if(f instanceof Movable)
			System.out.println("f는 Movable인터페이스를 구현했습니다");
		if(f instanceof Attackable)
			System.out.println("f는 Attackable인터페이스를 구현했습니다");
		if(f instanceof Object)
			System.out.println("f는 Object클래스의 자손입니다");
		
	}
} 
