import java.util.Objects;

/*
 * ��¥: 2021/05/18
 * ����: �ڹ��� ����_ObjectŬ����_toString()
 * �̸�: ���ϸ�
 * toString(): ��ü(iv)�� ���ڿ��� ��ȯ�ϱ� ���� �޼���
 * return getClass().getName()+"@"+Integer.toHexString(hashCode());
 *   ->   ���赵��ü.Ŭ�����̸� + at + 16������ �ؽ��ڵ�
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
	//ObjectŬ������ toString()�� �������̵�
	public String toString() { 
		return "kind : "+ kind +", number : "+ number;
	}
	//ObjectŬ������ equals()�� �������̵�
	public boolean equals(Object obj) {
		if(!(obj instanceof Card)) {
			return false;
		}else {
			Card c = (Card)obj;
			//���ڿ� �񱳴� �׻� equals���(�����) -> '=='��񱳴� �ּҺ��̹Ƿ� ���� �ٸ� �� ����
			return this.kind.equals(c.kind) && this.number==c.number;
		}
	}
	//equals()�� �������̵��ϸ� hashCode()�� �������̵� �ؾ���
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