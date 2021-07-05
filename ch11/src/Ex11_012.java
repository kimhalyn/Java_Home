import java.util.*;

/*
 * 날짜: 2021/05/31
 * 내용: 자바의 정석_HashSet(2)
 * 이름: 김하린
 * HashSet은 객체를 저장하기 전 -> 기존에 같은 객체가 있는지 확인 
 * boolean add(Object o)는 저장할 객체의 equals()와 hashCode()를 호출
 * -> equals()와 hashCode()가 오버라이딩 되어 있어야 함
 */
public class Ex11_012 {

	public static void main(String[] args) {
		
		HashSet set = new HashSet();
		
		set.add("abc");
		set.add("abc");
		set.add(new Person("David", 10));
		set.add(new Person("David", 10));
		
		System.out.println(set);
	}
}

//equals()와 hashCode()를 오버라이딩해야 HashSet이 바르게 동작
class Person{
	String name;
	int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name, age);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Person)) return false;
		
		Person p = (Person)obj;
		return this.name.equals(p.name) && this.age==p.age;
		
	}
	public String toString() {
		return name +":"+ age;
	}
}
