import java.util.*;

/*
 * ��¥: 2021/05/31
 * ����: �ڹ��� ����_HashSet(2)
 * �̸�: ���ϸ�
 * HashSet�� ��ü�� �����ϱ� �� -> ������ ���� ��ü�� �ִ��� Ȯ�� 
 * boolean add(Object o)�� ������ ��ü�� equals()�� hashCode()�� ȣ��
 * -> equals()�� hashCode()�� �������̵� �Ǿ� �־�� ��
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

//equals()�� hashCode()�� �������̵��ؾ� HashSet�� �ٸ��� ����
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
