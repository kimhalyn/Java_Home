import java.util.ArrayList;
import java.util.Iterator;

/*
 * ��¥: 2021/06/01
 * ����: �ڹ��� ����_Iterator�� ���׸���
 * �̸�: ���ϸ�
 */
class Ex12_004 {
	
	public static void main(String[] args) {
		
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student("�ڹٿ�", 1, 1));
		list.add(new Student("�ڹ�¯", 1, 2));
		list.add(new Student("ȫ�浿", 2, 1));

		Iterator<Student> it = list.iterator(); //Ÿ�� ����
		while (it.hasNext()) {
		//  Student s = (Student)it.next(); // ���׸����� ������� ������ ����ȯ �ʿ�.
			Student s = it.next(); //Ÿ�� �������� ����ȯ x
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
		
	
	