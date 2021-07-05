/*
 * ��¥: 2021/05/13
 * ����: �ڹ��� ����_������
 * �̸�: ���ϸ�
 * Ŭ����, Ŭ���� ����� �ΰ����� �ǹ� �ο�, ���� �����ڴ� �ϳ��� ���
 * ���� ������: public, private, (default), protected
 * �� ��: static(��������), final(��������), abstract, native, transient, synchronized, volatile, strictfp
 */
class Card{
	final int NUMBER;
	final String KIND;
	static int width = 100;
	static int height = 250;
	
	Card(String kind, int num){
		KIND = kind;
		NUMBER = num;
	}
	Card(){
		this("HEART", 1);
	}
	public String toString() {
		return KIND +" " +NUMBER;
	}
}
public class Ex7_010 {

	public static void main(String[] args) {
		
		 Card c = new Card("HEART", 10);
//		 c.NUMBER = 5; ����, ��? -> final ������ ������ �� ���� �Ұ�
		 System.out.println(c.KIND);
		 System.out.println(c.NUMBER);
		 System.out.println(c); //system.out.println(c.toString());
		
	}
	
} 
