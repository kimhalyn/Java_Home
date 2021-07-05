import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
 * ��¥: 2021/05/27
 * ����: �ڹ��� ����_����ȭ Ŭ����(SimpleDateFormat)
 * �̸�: ���ϸ�
 * ��¥�� �ð��� �پ��� �������� ����� �� �ְ� ����
 */
public class Ex10_011 {

	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();
		cal.set(2005, 9, 3); //2005/10/3
		
		Date d = cal.getTime(); //Calendar�� Date�� ��ȯ
		
		SimpleDateFormat sdf1, sdf2, sdf3, sdf4;
		sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		sdf2 = new SimpleDateFormat("yy-MM-dd E����");
		sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); //H:�ð�(0~23)
		sdf4 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a"); //h:�ð�(0~12)
		
		System.out.println(sdf1.format(d));
		System.out.println(sdf2.format(d));
		System.out.println(sdf3.format(d));
		System.out.println(sdf4.format(d));
	}
}
