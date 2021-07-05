import java.util.Calendar;

/*
 * ��¥: 2021/05/27
 * ����: �ڹ��� ����_��¥�� �ð� & ����ȭ(get()���)
 * �̸�: ���ϸ�
 * get(): �ʵ� �б�
 * CalendarŬ������ �߻�Ŭ���� -> getInstance()�� ���� ��ü����
 * 
 * <Calendar�� ���ǵ� �ʵ�-��¥>
 * WEEK_OF_YEAR: 1��1�Ϻ��� ~ ���ݱ��� �� ��° ��
 * WEEK_OF_MONTH: �� ���� 1�Ϻ��� �� ��° ��
 * MONTH: 0���� ���۵ǹǷ� -> +1 �ؾ� ��
 * DAY_OF_MONTH: �� ���� �� ��° ��
 * DAY_OF_YEAR: �� ���� �� ��° ��
 * DAY_OF_WEEK: ����, 1:�Ͽ��Ϸ� ����
 * DAY_OF_WEEK_IN_MONTH: �� ���� �� ��° ����
 * 
 * <Calendar�� ���ǵ� �ʵ�-�ð�>
 * HOUR: �ð�(0~11)
 * HOUR_OF_DAY: �ð�(0~23)
 * AM_PM: ����/����
 */
public class Ex10_001 {

	public static void main(String[] args) {
		
//		Calendar cal = new Carlendar(); ���� -> �߻�Ŭ������ �ν��Ͻ� ���� �Ұ���
		Calendar today = Calendar.getInstance(); //���� ��¥�� �ð����� ����
		System.out.println("������ �⵵ :"+ today.get(Calendar.YEAR));
		System.out.println("��(0~11�̹Ƿ� �׻� +1) :"+today.get(Calendar.MONTH));
		System.out.println("�� ���� �� ° �� :"+ today.get(Calendar.WEEK_OF_YEAR));
		System.out.println("�� ���� �� ° �� :"+ today.get(Calendar.WEEK_OF_MONTH));
		
		//date�� day_of_month�� ����
		System.out.println("�� ���� �� ��: "+ today.get(Calendar.DATE));
		System.out.println("�� ���� �� ��: "+ today.get(Calendar.DAY_OF_MONTH));
		System.out.println("�� ���� �� ��: "+ today.get(Calendar.DAY_OF_YEAR));
		System.out.println("����(1:�Ͽ���~) :"+ today.get(Calendar.DAY_OF_WEEK));
		System.out.println("�� ���� �� ° ����: "+ today.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println("����(0)/����(1) :"+ today.get(Calendar.AM_PM));
		System.out.println("�ð�(0~11) :"+ today.get(Calendar.HOUR));
		System.out.println("�ð�(0~23) :"+ today.get(Calendar.HOUR_OF_DAY));
		System.out.println("��(0~59) :"+ today.get(Calendar.MINUTE));
		System.out.println("��(0~59) :"+ today.get(Calendar.SECOND));
		System.out.println("1000���� 1��(0~999): "+ today.get(Calendar.MILLISECOND));
		System.out.println("Timezone(-12~+12): "+ (today.get(Calendar.ZONE_OFFSET)/(60*60*1000)));
		System.out.println("�� ���� ������ ��: "+ today.getActualMaximum(Calendar.DATE));
	}
}
