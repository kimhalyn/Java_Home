import java.util.Calendar;

/*
 * ��¥: 2021/05/27
 * ����: �ڹ��� ����_��¥�� �ð� & ����ȭ(set()���)
 * �̸�: ���ϸ�
 * set(): �ʵ� ����
 */
public class Ex10_002 {

	public static void main(String[] args) {

		final String[] DAY_OF_WEEK = { "", "��", "��", "ȭ", "��", "��", "��", "��" };

		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();

		date1.set(2019, 3, 29);
		System.out.println("date1�� " + toString(date1) + DAY_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)] + "�����̰�,");
		System.out.println("date2�� " + toString(date2) + DAY_OF_WEEK[date2.get(Calendar.DAY_OF_WEEK)] + "�����Դϴ�.");

//		�� ��¥���� ������ ��������, õ���� ���� ������ ��ȯ�ؾ� ��(getTimeInMillis())
		long difference = (date2.getTimeInMillis() - date1.getTimeInMillis()) / 1000;
		System.out.println("�� ��(date1)���� ����(date2)���� " + difference + "�ʰ� �������ϴ�.");
		System.out.println("��(day)�� ����ϸ� " + difference / (24 * 60 * 60) + "���Դϴ�.");

	}

	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR) + "�� " + (date.get(Calendar.MONDAY) + 1) + "�� " + date.get(Calendar.DATE) + "�� ";
	}
}