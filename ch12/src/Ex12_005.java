import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/*
 * 날짜: 2021/06/01
 * 내용: 자바의 정석_HashMap과 지네릭스
 * 이름: 김하린
 */
class Ex12_005 {

	public static void main(String[] args) {
		
		HashMap<String, Student1> map = new HashMap<String, Student1>(); //생성자 타입생략 가능 -> <>
		
		map.put("이순신", new Student1("이순신", 1, 1, 100, 100, 100));
		
		Student1 s = map.get("이순신");
		
		System.out.println(s.name);
		
	}
}

class Student1 {
	String name = "";
	int ban;
	int no;
	int kor;
	int eng;
	int math;

	Student1(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math; 
	}
}
