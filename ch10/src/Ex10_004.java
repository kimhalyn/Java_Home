import java.util.Calendar;
import java.util.Date;

/*
 * ��¥: 2021/05/27
 * ����: �ڹ��� ����_��¥�� �ð� & ����ȭ(clear())
 * �̸�: ���ϸ�
 * clear(): Calendar��ü�� ��� �ʵ带 �ʱ�ȭ
 */
public class Ex10_004 {

	public static void main(String[] args) {
		
	Calendar dt = Calendar.getInstance();
	System.out.println(new Date(dt.getTimeInMillis()));
	
	dt.clear(); //��� �ʵ� �ʱ�ȭ
	System.out.println(new Date(dt.getTimeInMillis()));

//	Ư�� �ʵ� �ʱ�ȭ
//	dt.clear(Calendar.SECOND); 
//	dt.clear(Calendar.MINUTE);
//	dt.clear(Calendar.HOUR_OF_DAY);
//	dt.clear(Calendar.HOUR);
	
//	System.out.println(new Date(dt.getTimeInMillis()));
	
	
	}
}
