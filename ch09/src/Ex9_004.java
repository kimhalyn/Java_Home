import java.util.Objects;

/*
 * 날짜: 2021/05/18
 * 내용: 자바의 정석_Object클래스_toString()
 * 이름: 김하린
 * toString(): 객체(iv)를 문자열로 변환하기 위한 메서드
 * return getClass().getName()+"@"+Integer.toHexString(hashCode());
 *   ->   설계도객체.클래스이름 + at + 16진수의 해시코드
 */
class Card {
	String kind; // this.kind
	int number; // this.number

	Card() {
		this("SPADE", 1); 
	}

	Card(String kind, int number) {
		this.kind = kind;
		this.number = number;
	}
	//Object클래스의 toString()을 오버라이딩
	public String toString() { 
		return "kind : "+ kind +", number : "+ number;
	}
	//Object클래스의 equals()을 오버라이딩
	public boolean equals(Object obj) {
		if(!(obj instanceof Card)) {
			return false;
		}else {
			Card c = (Card)obj;
			//문자열 비교는 항상 equals사용(내용비교) -> '=='등가비교는 주소비교이므로 값이 다를 수 있음
			return this.kind.equals(c.kind) && this.number==c.number;
		}
	}
	//equals()를 오버라이딩하면 hashCode()도 오버라이딩 해야함
	public int hashCode() {
		return Objects.hash(kind, number);
	}
}

public class Ex9_004 {

	public static void main(String[] args) {

		Card c1 = new Card();
		Card c2 = new Card();

		System.out.println(c1.toString());
		System.out.println(c2.toString());
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		
		System.out.println(c1.equals(c2));
	}
}