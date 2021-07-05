import java.util.ArrayList;
import java.util.Iterator;

/*
 * 날짜: 2021/06/01
 * 내용: 자바의 정석_Iterator와 지네릭스
 * 이름: 김하린
 */
class Ex12_004 {
	
	public static void main(String[] args) {
		
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student("자바왕", 1, 1));
		list.add(new Student("자바짱", 1, 2));
		list.add(new Student("홍길동", 2, 1));

		Iterator<Student> it = list.iterator(); //타입 지정
		while (it.hasNext()) {
		//  Student s = (Student)it.next(); // 지네릭스를 사용하지 않으면 형변환 필요.
			Student s = it.next(); //타입 지정으로 형변환 x
			System.out.println(s.name);
		}
	} // main
}

class Student {
	String name = "";
	int ban;
	int no;

	Student(String name, int ban, int no) {
		this.name = name;
		this.ban = ban;
		this.no = no;
	}
}
		
	
	