import java.util.Calendar;
import java.util.Date;

/*
 * ��¥: 2021/05/27
 * ����: �ڹ��� ����_Date�� Calrendar���� ��ȯ
 * �̸�: ���ϸ�
 */
public class Ex10_008 {

	public static void main(String[] args) {

//		1. Calrendar�� Date�� ��ȯ -> getTimeInMillis()
		Calendar cal1 = Calendar.getInstance();
		Date d1 = new Date(cal1.getTimeInMillis());
		
//		2. Date�� Calrendar�� ��ȯ -> setTime()	
		Date d2 = new Date();
		Calendar cal2 = Calendar.getInstance();
		cal2.setTime(d2);
		
	}
}
