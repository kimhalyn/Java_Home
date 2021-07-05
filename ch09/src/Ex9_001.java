/*
 * ��¥: 2021/05/18
 * ����: �ڹ��� ����_ObjectŬ����_equals(Object obj)
 * �̸�: ���ϸ�
 * ObjectŬ����:��� Ŭ������ �ְ� ����, 11���� �޼��常 ������ ����
 * clone(): ��ü ����
 * equals(): ��ü �ڽ�(this)�� �־��� ��ü(obj)�� ��(��ü �ּҸ� ��), ������ true �ٸ��� false
 * toString(): ��ü������ ���ڿ��� ��ȯ
 */
class Value {
	int value;

	Value(int value) {
		this.value = value;
	}
//	Object�� equals()�� �������̵��ؼ� �ּҰ� �ƴ� value�� ��
//	public boolean equals(Object obj) {
////		���������� ����ȯ ���� �ݵ�� instanceof�� Ȯ��
//		if(!(obj instanceof Value)) return false;
//		
//		Value v = (Value)obj; //obj�� value�� ����ȯ
//		
//		return this.value == v.value;
//	}
}

public class Ex9_001 {

	public static void main(String[] args) {

		Value v1 = new Value(10);
		Value v2 = new Value(10);

		if (v1.equals(v2)) { //��ü �ּҰ� ��
			System.out.println("v1�� v2�� �����ϴ�");
		} else {
			System.out.println("v1�� v2�� �ٸ��ϴ�");
		}
		
		v1 = v2;
		
		if (v1.equals(v2)) { //��ü �ּҰ� ��
			System.out.println("v1�� v2�� �����ϴ�");
		} else {
			System.out.println("v1�� v2�� �ٸ��ϴ�");
		}
	}

}
