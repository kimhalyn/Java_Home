/*
 * 날짜: 2021/05/18
 * 내용: 자바의 정석_Object클래스_equals(Object obj)
 * 이름: 김하린
 * equals(): 원래는 주소값으로 비교하지만, iv로 판단하게끔 오버라이딩 할 수 있음(대부분) 
 */
class Person {

	long id; //this.id

//	Object의 equals()를 오버라이딩해서 주소가 아닌 value를 비교
	public boolean equals(Object obj) {
//		참조변수의 형변환 전에 반드시 instanceof로 확인
		if (obj instanceof Person) {
			return this.id == ((Person) obj).id;
		} else {
			return false;
		}
	}

	Person(long id) {
		this.id = id;
	}
}

public class Ex9_002 {

	public static void main(String[] args) {

		Person p1 = new Person(801007);
		Person p2 = new Person(801007);

		if (p1.equals(p2)) {
			System.out.println("p1과 p2는 같은 사람입니다");
		} else {
			System.out.println("p1과 p2는 다른 사람입니다");
		}

	}
}