import java.util.Calendar;

/*
 * ��¥: 2021/05/27
 * ����: �ڹ��� ����_��¥�� �ð� & ����ȭ(add())
 * �̸�: ���ϸ�
 * add():  Ư�� �ʵ��� ���� ���� �Ǵ� ����(�ٸ� �ʵ忡 ���� ��ħ) 8�� 31�� -> 9�� 1��
 * roll(): Ư�� �ʵ��� ���� ���� �Ǵ� ����(�ٸ� �ʵ忡 ���� x) 8�� 31�� -> 8�� 1��
 */
public class Ex10_005 {

	public static void main(String[] args) {
		
		Calendar date = Calendar.getInstance();
		date.set(2015, 7, 31); //2015. 8. 31
		System.out.println(toString(date));

		System.out.println("= 1�� �� =");
		date.add(Calendar.DATE, 1);
		System.out.println(toString(date));
		
		System.out.println("= 6�� �� =");
		date.add(Calendar.MONDAY, -6);
		System.out.println(toString(date));
		
		System.out.println("= 31�� ��(roll) =");
		date.roll(Calendar.DATE, 31);
		System.out.println(toString(date));
		
		System.out.println("= 31�� ��(add)");
		date.add(Calendar.DATE, 31);
		System.out.println(toString(date));
		
	}
	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR)+ "�� "+ (date.get(Calendar.MONDAY)+1)+ "�� "+ date.get(Calendar.DATE)+"��";
	}
}