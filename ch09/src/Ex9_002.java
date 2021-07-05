/*
 * ��¥: 2021/05/18
 * ����: �ڹ��� ����_ObjectŬ����_equals(Object obj)
 * �̸�: ���ϸ�
 * equals(): ������ �ּҰ����� ��������, iv�� �Ǵ��ϰԲ� �������̵� �� �� ����(��κ�) 
 */
class Person {

	long id; //this.id

//	Object�� equals()�� �������̵��ؼ� �ּҰ� �ƴ� value�� ��
	public boolean equals(Object obj) {
//		���������� ����ȯ ���� �ݵ�� instanceof�� Ȯ��
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
			System.out.println("p1�� p2�� ���� ����Դϴ�");
		} else {
			System.out.println("p1�� p2�� �ٸ� ����Դϴ�");
		}

	}
}