import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/*
 * ��¥: 2021/06/01
 * ����: �ڹ��� ����_HashMap�� ���׸���
 * �̸�: ���ϸ�
 */
class Ex12_005 {

	public static void main(String[] args) {
		
		HashMap<String, Student1> map = new HashMap<String, Student1>(); //������ Ÿ�Ի��� ���� -> <>
		
		map.put("�̼���", new Student1("�̼���", 1, 1, 100, 100, 100));
		
		Student1 s = map.get("�̼���");
		
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
