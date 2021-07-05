import java.util.Calendar;

/*
 * ��¥: 2021/05/27
 * ����: �ڹ��� ����_��¥�� �ð� & ����ȭ(add())
 * �̸�: ���ϸ�
 * add():  Ư�� �ʵ��� ���� ���� �Ǵ� ����(�ٸ� �ʵ忡 ���� ��ħ) 8�� 31�� -> 9�� 1��
 * roll(): Ư�� �ʵ��� ���� ���� �Ǵ� ����(�ٸ� �ʵ忡 ���� x) 8�� 31�� -> 8�� 1��
 */
public class Ex10_006 {

	public static void main(String[] args) {

		Calendar date = Calendar.getInstance();
		
		date.set(2015, 0, 31); //2015/1/31�� ����
		System.out.println(toString(date));
		
//		(����) �� �ʵ尡 ���� �� ��, roll()�� �� �ʵ带 �����ϸ� -> �� ���� �� �ʵ忡�� ���� ����
		date.roll(Calendar.MONTH, 1);
		System.out.println(toString(date));
	
		date.add(Calendar.MONTH, 1);
		System.out.println(toString(date));
	}
	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR)+"�� "+ (date.get(Calendar.MONTH)+1)+"�� "+ date.get(Calendar.DATE)+"��";
	}
}
